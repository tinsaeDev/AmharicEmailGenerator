



			import javax.swing.*;
			import javax.swing.filechooser.*;
			import java.io.*;
		
		public class FileOpener{
		
		
			public static String  open(){
				
				
				
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Geez mail generator files","GMG"); 
				
				chooser.setFileFilter(filter);
				
				int returnVal = chooser.showOpenDialog( UIModel.mainWindow );
				
				
					if(returnVal==0){
						
						File f = chooser.getSelectedFile();
							if( f.exists() ){
			
								return f.getAbsolutePath();
									
							}
							
							else{
								
								JOptionPane.showMessageDialog(UIModel.mainWindow,"The selected file does not exist","File not found",JOptionPane.ERROR_MESSAGE );
								open();
								
							}
					
					}

			    	return null;
				
				
			}
		
		
		}