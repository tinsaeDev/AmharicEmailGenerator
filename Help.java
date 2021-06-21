


		// settings dialog
		
		import javax.swing.*;
		import java.awt.*;
		import java.awt.event.*;
		import java.io.*;
		
		public class Help {
		
		
				Dialog dialog = new Dialog(UIModel.mainWindow);
				
				JTextArea HelpTa = new JTextArea("To Open new existing file.\n"+
												 "\t *.Click file -> open, then navigate to the file you would like to open\n."+
												 "To Save your file \n"+
												 "\t *.Click file -> new, then enter number of peole you like to manage\n."+
												 "To Save your file \n"+
												 "\t *.Click file -> save, a dialog will open if you are saving for frist time\n"+
												 "To close file \n "+
												 "\t .Click file -> close , if you have unsaved file a dialog will open\n"+
												 "To exit program \n"+
												 "\t .Click file -> exit , if you have unsaved file a dialog will open\n"				
														
														);
														
				JButton ok =  new JButton("Ok"); 
				
				JPanel superPanel = new JPanel( new BorderLayout() );
				JPanel HelpPanel = new JPanel( new GridLayout() );
				JPanel okPanel = new JPanel( new FlowLayout() ); 

				public Help(){
				
				
					ok.addActionListener( new ActionListener(){
						
						@Override
						public void actionPerformed(ActionEvent event){
							
							dialog.dispose();
						
							
						}
						
						
					} );
					// HelpTa.setFont( new Font("lucida console",Font.PLAIN,20 ) );
		
					HelpTa.setEditable(false);
					
					
					okPanel.add(ok);
					
					HelpPanel.add( HelpTa );
					superPanel.add( HelpPanel, BorderLayout.CENTER);
					superPanel.add( okPanel,BorderLayout.PAGE_END );
					dialog.add( superPanel );
					
					dialog.setSize( 600,400 );
					
					
					
					int xWindow = UIModel.mainWindow.getWidth();
					int yWindow = UIModel.mainWindow.getHeight();

					int locXWindow = (int) UIModel.mainWindow.getLocation().getX();
					int locYWindow = (int) UIModel.mainWindow.getLocation().getY();
					
				
					
					int halfWidthWindow = xWindow /2;
					int halfHeightWindow = yWindow/2;
					
					dialog.setLocation( locXWindow+(halfWidthWindow-300), locYWindow+(halfHeightWindow-200) );
					
					
					
					dialog.setResizable( false );
					dialog.setModal( true );
					dialog.show();
				}
				

	}