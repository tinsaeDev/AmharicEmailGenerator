


			import javax.swing.JOptionPane;


			public class CloseFile{
											
			public static void  close(){
							
			
			
			UIModel.pane.remove(DataStore.table);
			
			ProgramState.fileOpened = false;
			ProgramState.tableCreated = false;
			ProgramState.tableModified = false;
			ProgramState.fileName = null;
			DataStore.tableModel = null;
			DataStore.table= null;
			DataStore.tableData = null;
		
			
			// used to repaint window indirectly
			
			int x = (int) UIModel.mainWindow.getSize().getWidth();
			int y = (int) UIModel.mainWindow.getSize().getHeight();
			
			UIModel.mainWindow.setSize(x+1,y+1);
			UIModel.mainWindow.setSize(x,y);
			
								
								
							}
							
			public static void confirm(){
								
				int returnValue = JOptionPane.showConfirmDialog( UIModel.mainWindow,
															
															"Do you want to save your changes ?",
															"Confirm file close ",
															JOptionPane.YES_NO_CANCEL_OPTION,
															JOptionPane.QUESTION_MESSAGE
															
															);
							
				if(returnValue==2){
								
				// Nothing
						}
							
				else if(returnValue==1){					
					close();
							}
							
				else if(returnValue==0 ){
					FileSaver.save();
					close();
								}
								
						}
							
					}