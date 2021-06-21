


			import javax.swing.JOptionPane;


			public class ExitApp{
											
			public static void  exit(){
							
				System.exit(0);
							
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
					exit();
							}
							
				else if(returnValue==0 ){
					FileSaver.save();
					exit();
								}
								
						}
							
					}