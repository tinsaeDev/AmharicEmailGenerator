

		import java.awt.*;
		import java.awt.event.*;
		import javax.swing.event.*;
		import javax.swing.*;
		import javax.swing.table.*;
		import java.io.*;
		
		public class MenuItemEventListener implements ActionListener{
		
		
							
			@Override
			public void actionPerformed(ActionEvent event){
						
					JMenuItem source = (JMenuItem) event.getSource();	

					if(source == UIModel.openMenuItem  ){
						
						
						// if file not modified
						
						if( ProgramState.tableModified ){
							
				int returnValue = JOptionPane.showConfirmDialog( UIModel.mainWindow,
															
															"Do you want to save your changes ?",
															"Open file ",
															JOptionPane.YES_NO_CANCEL_OPTION,
															JOptionPane.QUESTION_MESSAGE
															
															);
							
				if(returnValue==2){
								
				// Nothing
						}
							
				else if(returnValue==1){					
					
					CloseFile.close();
					actionPerformed( event );
					
					
							}
							
				else if(returnValue==0 ){
					
					CloseFile.close();
					actionPerformed( event );
					
								}
							
							
						}
						
						else{
							
							String fileName = FileOpener.open();
							
							if( fileName==null ){
								
								// User canced operation
								
							}

							else{
							
							ProgramState.fileName = fileName;
							ProgramState.fileOpened =true;
							
							try{
							
							FileInputStream f = new FileInputStream( fileName );
							ObjectInputStream o = new ObjectInputStream( f );
							 
							DataStore.tableData = (TableData) o.readObject();							
							TableCreator.createTable( DataStore.tableData );
							
								}
								
							catch(Exception e){
								
							System.out.println("Unable to deseralize TableModel"+e.getMessage() );
							e.printStackTrace();
								
							}
						}
						
						
						}
 						
						
						 
						
					}
					
					else if(source == UIModel.newMenuItem){
						
						
						
				if( ProgramState.tableModified ){
				int returnValue = JOptionPane.showConfirmDialog( UIModel.mainWindow,
															
															"Do you want to save your changes ?",
															"Create new file ",
															JOptionPane.YES_NO_CANCEL_OPTION,
															JOptionPane.QUESTION_MESSAGE
															
															);
							
				if(returnValue==2){
								
				// Nothing
						}
							
				else if(returnValue==1){					
					
					ProgramState.tableModified = false;
					ProgramState.fileOpened = false;
					actionPerformed( event );
					
					
							}
							
				else if(returnValue==0 ){
					
					FileSaver.save();
					ProgramState.tableModified = false;
					ProgramState.fileOpened = false;
					actionPerformed( event );
					
								}
							
							
						}
						
						else{
							
							NewDialog newDialog = new NewDialog(UIModel.mainWindow);
									  newDialog.show();
											
											if( newDialog.inputError || newDialog.numberOfRow<=0){
																		
												JOptionPane.showMessageDialog(UIModel.mainWindow,"You Must Enter Proper values");												
											}
											
											else if( newDialog.userCanceled ){
												
												// Nothing
												
											}
											
											else{
												
												int row_size = newDialog.numberOfRow;

												ProgramState.numberOfTableRow = row_size;
												
												
												
												System.out.println( "Row Size "+ row_size  );
												
												DataStore.tableData = new TableData( row_size );
												
												
												System.out.println( "Table Data :" +DataStore.tableData.getNumberOfRow()  );
												
												TableModelMod.numberOfRow = row_size; // change for new table
												
												
											try{
												
												UIModel.pane.remove( DataStore.table ); // remove previouse table
												UIModel.pane.validate();
											}
											
											catch(Exception e){
												
												System.out.println("Error removing table");
												
											}
												TableCreator.createTable();
												UIModel.pane.add( DataStore.table,BorderLayout.CENTER );
												
												ProgramState.tableCreated = true;
												UIModel.pane.validate();
												
												
											}
										
							
						}
						
						
					}
					
					else if( source==UIModel.saveMenuItem ){
							
								if( ProgramState.tableModified ){
									
									
									FileSaver.save();
								
								}
								else{
									
									
									System.out.println(" No reason to save ");
									
								}
								
								
								
												
							}
	
					else if( source==UIModel.saveAsMenuItem){
						
						
						if( ProgramState.tableCreated ){
								
								FileSaver.saveAs();
								
								}							
					}
				
					else if( source==UIModel.closeMenuItem){
				
						if( ProgramState.tableModified ){
									
									CloseFile.confirm();
						}
						
						else if( !ProgramState.tableCreated ) {
							
							// Already Closed 
								   
							
						}
						
						else if( !ProgramState.tableModified && ProgramState.tableCreated  ){
							
								CloseFile.close();
							
						}
						
						
						
					}
					
					else if( source==UIModel.exitMenuItem){
						
						if( ProgramState.tableModified ){

								ExitApp.confirm();
							
						}
													
						else{
							
								ExitApp.exit();
							
						}
						
					}
					
					else if( source==UIModel.preference ){
						
						
						new PreferenceWindow();
						
					}
					
					else if( source== UIModel.latinToGeez ){
						
						
						new ToGeez();
						
					}
			}
			
		
			}