


		// settings dialog
		
		import javax.swing.*;
		import java.awt.*;
		import java.awt.event.*;
		import java.io.*;
		
		public class PreferenceWindow{
		
		
				JDialog dialog;
				JPanel panel;
				
				JCheckBox editEnglishNames;
				JCheckBox editMailAdress;
				
				JLabel mailServerLabel;
				JTextField mailServerField;
				
				JButton ok;
				
				
				boolean editMail;
				boolean editEnglish;
				String server;
				
				public PreferenceWindow(){
					
					
					editEnglish = DataStore.settings.editEnglishColumn;
					editMail = DataStore.settings.editMailColumn;
					server = DataStore.settings.mailServerAdress;
					
					dialog = new JDialog();
					
					panel = new JPanel( new GridLayout(5,1) );
					
					editEnglishNames = new JCheckBox("Edit English names",editEnglish );
					editMailAdress = new JCheckBox("Edit Mail Adress",  editMail );
					
					mailServerLabel = new JLabel(" Server address ");			
					mailServerField = new JTextField(server);
					
					ok = new JButton("Ok");
					ok.addActionListener( new ActionListener(){
						
						@Override
						public void actionPerformed(ActionEvent e){
							
							DataStore.settings.editEnglishColumn = editEnglishNames.isSelected();
							DataStore.settings.editMailColumn = editMailAdress.isSelected();

							DataStore.settings.mailServerAdress =  mailServerField.getText();
							
							dialog.dispose();
							
							try{
								
							FileOutputStream fo = new FileOutputStream("settings.db");
							ObjectOutputStream oo = new ObjectOutputStream(fo);
												oo.writeObject( DataStore.settings );
											fo.close();
											
											oo = null;
											fo = null;
								
								}
							catch(Exception ee){
								
									System.err.println("Unable to save settings"+ee.getMessage() );
								
							}
														
						}
						
					} );
						
						
					
					
					
					panel.add(editEnglishNames);
					panel.add(editMailAdress);
					panel.add(mailServerLabel);
					panel.add(mailServerField);
					panel.add(ok);
					
					
					
					
					dialog.setSize( 200,300 );
					
					
					int xWindow = UIModel.mainWindow.getWidth();
					int yWindow = UIModel.mainWindow.getHeight();

					int locXWindow = (int) UIModel.mainWindow.getLocation().getX();
					int locYWindow = (int) UIModel.mainWindow.getLocation().getY();
					
				
					
					int halfWidthWindow = xWindow /2;
					int halfHeightWindow = yWindow/2;
					
					dialog.setLocation( locXWindow+(halfWidthWindow-100), locYWindow+(halfHeightWindow-150) );
					
					
					
					dialog.setResizable( false );
					dialog.setModal( true );
					dialog.add(panel);
					dialog.show();
				}
		
		
			}