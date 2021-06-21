


			import java.io.*;
			import javax.swing.filechooser.*;
			import javax.swing.*;
			
			
			public class FileSaver{
			
			
			
		public static void saveAs(){
					
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Geez Email Generator files", "gmg");
								
			chooser.setFileFilter(filter);
								
			int returnVal = chooser.showSaveDialog( UIModel.mainWindow );
										
			if(returnVal == 0) {
												
				ProgramState.fileName = chooser.getSelectedFile().getAbsolutePath();
				ProgramState.fileName += ".gmg";
				ProgramState.fileOpened = true;
				write();
				
				}
			
			else{
				
				
				System.out.println("User Cancelled operation");
				
					}
					
				}
					
				public static void write(){
					
					System.out.println("*** Starting to write file *** "+DataStore.tableData.getNumberOfRow() + " **** ");
					
					TableData td = DataStore.tableData;
					
					for(int i=0; i<td.getNumberOfRow() ; i++ ){
						
						for(int j=0; j<4; j++){
							
							
							td.setData( DataStore.tableModel.getValueAt(i,j) ,i,j  );
							System.out.println( td.getNumberOfRow() );
							
						}
					System.out.println(td.getNumberOfRow());
						
					}			
					
					try{
						
						System.out.println("Saving at "+ProgramState.fileName);
				
						FileOutputStream fo = new FileOutputStream( ProgramState.fileName );
						ObjectOutputStream oo = new ObjectOutputStream( fo );
										   
										   oo.writeObject(td);
										   fo.close();
										   
										   fo = null;
										   oo = null;
										   
						ProgramState.tableModified = false;
								
									}
					
					
					catch(Exception e){
												
						System.err.println("Unable to write table Model"+e.getMessage() );
						
						System.out.println("**************************\n");
						e.printStackTrace();
						System.out.println("**************************\n");
					}
						
						}
						
				public static void save(){
				
				
				if(ProgramState.fileOpened){
					
					write();
					
				}
				
				else if( !ProgramState.fileOpened ){
					
					saveAs();
					
				}
					
				
				}
				
		
					}