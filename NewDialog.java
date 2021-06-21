


	// It is this class that sets Number of Row in Data Store.



		
		import javax.swing.*;
		import java.awt.*;
		import java.awt.event.*;
		
		
		
		public class NewDialog extends Dialog implements ActionListener{
		
				int numberOfRow;
			
				JPanel superPane;
						
				JLabel numberOfPeopleLabel;
				JTextField numberOfPeopleField;
				JPanel queryPane;
				
				JButton nextButton;
				JButton cancelButton;
				JPanel submitionPane;
				
				
				JPanel pane;
				
				boolean userCanceled;
				boolean inputError;
				
			public NewDialog(JFrame owner ){
				
				super(owner);
				
					numberOfPeopleLabel = new JLabel("Number of People");
					numberOfPeopleField = new JTextField(20);
					
					queryPane = new JPanel( new GridLayout(1,2,10,10) );
					queryPane.add( numberOfPeopleLabel );
					queryPane.add( numberOfPeopleField );
					
					
					cancelButton = new JButton("Cancel");
						cancelButton.addActionListener(this);
						
					nextButton = new JButton("Next");
						nextButton.addActionListener(this);
						
					submitionPane = new JPanel( new BorderLayout() );
					submitionPane.add( cancelButton, BorderLayout.WEST );
					submitionPane.add( nextButton, BorderLayout.EAST);
					
					pane = new JPanel( new BorderLayout() );
					pane.add( queryPane, BorderLayout.CENTER );
					pane.add( submitionPane, BorderLayout.SOUTH );
					
					superPane = new JPanel( new FlowLayout() );
					superPane.add( pane  );
					
					this.setModal(true);
					this.add(superPane);
				
					this.setSize(500,100);
				
				
					int xWindow = UIModel.mainWindow.getWidth();
					int yWindow = UIModel.mainWindow.getHeight();

					int locXWindow = (int) UIModel.mainWindow.getLocation().getX();
					int locYWindow = (int) UIModel.mainWindow.getLocation().getY();
				
					int halfWidthWindow = xWindow /2;
					int halfHeightWindow = yWindow/2;
					
					this.setLocation( locXWindow+(halfWidthWindow-250), locYWindow+(halfHeightWindow-50) );
			
			}
			
			public void actionPerformed(ActionEvent event){
				
				JButton clickedButton = (JButton) event.getSource();
				
				
					if( clickedButton==cancelButton){
						
						this.dispose();
						userCanceled = true;
					}
					
					else if(clickedButton==nextButton ) {
			
					
						try{
							
							String text = numberOfPeopleField.getText();
							int temp = Integer.parseInt( text );
							numberOfRow = temp;
								this.dispose();
							
						}
						
						catch(Exception e){
	
								inputError = true;
								this.dispose();
						}
						
						
						}
				
				
			}
			
			
	
		}