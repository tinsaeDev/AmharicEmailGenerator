


		// settings dialog
		
		import javax.swing.*;
		import java.awt.*;
		import java.awt.event.*;
		import java.io.*;
		
		public class ToGeez{
		
		
				JDialog dialog;
				JPanel panel;
				
				
				JLabel englishName;
				JLabel amharicName;
				
				JTextField englishTextField;
				JTextField amharicTextField;
				
				
				JButton convert;
				
				String englishText="";
				String amahricText="";

				Dictionary d = new Dictionary();
				
				public ToGeez(){
					
					englishName = new JLabel("English");
					amharicName = new JLabel("Amharic");
					
					englishTextField = new JTextField(50);
					amharicTextField = new JTextField(50);
					
					
					dialog = new JDialog();
					panel = new JPanel( new GridLayout(5,1) );
					
				
					
					convert = new JButton("convert");
					convert.addActionListener( new ActionListener(){
						 
						 
						 @Override
						 public void actionPerformed(ActionEvent event){

    		                englishText = englishTextField.getText()+" ";
							amahricText = "";
							
							String temp = ""+englishText.charAt(0);
							int el = englishText.length();
							
							
							try{
								for(int i=0; i<(el-1); i++){
									
									char c = englishText.charAt(i+1);
									
									if( isVoul(c) ){
										temp = temp+c;
									}
					
									else{
					
										amahricText = amahricText + d.toGeez( temp );
							
										if( c ==' '){
											amahricText = amahricText + " ";
											i++;
												}
						
										temp = ""+englishText.charAt(i+1);
						
											}
					
								}
							}
							
							catch(StringIndexOutOfBoundsException e){
					
									System.out.println( "Index out of bounds" );
					
									}
				
				
					amharicTextField.setText( amahricText );
							 
							 
						 }
						 
					 });
						
						
					
					englishTextField.setFont( new Font("nyala",Font.PLAIN,25) );
					amharicTextField.setFont( new Font("nyala",Font.PLAIN,25) );
					amharicTextField.setEditable(false);
					
					
					panel.add(englishName);
					panel.add(englishTextField);
					panel.add(amharicName);
					panel.add(amharicTextField);
					panel.add(convert);
					
					
					
					dialog.setSize( 300,300 );
					
					
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
				
				
			public boolean isVoul(char cArg){
				
				
				if( cArg=='a'||cArg =='e'||cArg=='i'||cArg== 'o'||cArg=='u'){
					
					return true;
				}
				
				else if( cArg=='A'||cArg =='E'||cArg=='I'||cArg== 'O'||cArg=='U'){
					
					return true;
					
				}
				
				else{
					
					
					return false;
				}
				
				
			}
			
	
		
		
			}