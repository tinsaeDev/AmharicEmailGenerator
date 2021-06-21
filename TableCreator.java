
		import javax.swing.table.*;
		import javax.swing.*;
		import java.awt.*;
		import javax.swing.event.*;

		public class TableCreator{
		
			public static void createTable(TableData tableDataArg){
				
				
				DataStore.tableModel = new TableModelMod( tableDataArg );
							
				DataStore.table = new JTable( DataStore.tableModel  );
				DataStore.table.setRowHeight( 30 );
												
				decorateTable();
				
			   UIModel.pane.add( DataStore.table,BorderLayout.CENTER );
			   ProgramState.tableCreated = true;
				
				
			}		
			
			public static void createTable(){
				
					DataStore.tableModel= new TableModelMod( ProgramState.numberOfTableRow );
					DataStore.table = new JTable( DataStore.tableModel );
					DataStore.table.setRowHeight( 30 );
												
					decorateTable();
					ProgramState.tableCreated = true;
				
			}
			
			public static void decorateTable() {													
												
											
											// Setting custum cell editor
												
												TableColumn tableColumn0 = DataStore.table.getColumnModel().getColumn(0);
												TableColumn tableColumn1 = DataStore.table.getColumnModel().getColumn(1);
												TableColumn tableColumn2 = DataStore.table.getColumnModel().getColumn(2);
															
															JTextField jtf = new JTextField(20);
																	   jtf.setFont( new Font("Nyala",Font.PLAIN,20) );
															DefaultCellEditor tce = new DefaultCellEditor( jtf );
															
															tableColumn0.setCellEditor( tce );
															tableColumn1.setCellEditor( tce );
															tableColumn2.setCellEditor( tce );
															
											// Setting custum cell rederer
												
												DataStore.table.setDefaultRenderer(String.class, new MyTableCellRenderer() );
					
											// Setting column width for column 0

												TableColumn tc = DataStore.table.getColumnModel().getColumn(0);
															tc.setPreferredWidth(50);
															tc.setMaxWidth(50);
												
											// Adding TableModel Listener
											
													
													TableModelMod tmm = DataStore.tableModel;
													tmm.addTableModelListener( new TableModelListener(){
														
														@Override
														public void tableChanged(TableModelEvent event){
															
															
															if( event.getType() != TableModelEvent.UPDATE || 2 == event.getColumn() || 3 == event.getColumn() ){
																
																//System.out.println("Update");
																
															}
															
															else{
															
															int column_int = event.getColumn();
															int row_int = event.getFirstRow();
															
															String amharicText = (String) DataStore.tableData.getData( row_int,column_int );
															String englishText = new String("");
															String mailAddress = new String("");
															
															int amharicText_size = amharicText.length();
															System.out.println("Size: "+amharicText_size);
																
																Dictionary d = new Dictionary();
																for( int i=0; i<amharicText_size; i++ ){ // to convert amharic to geez 
																	
																	String temp = d.convertToEnglish( amharicText.charAt( i ) );
																	
																		if( temp==null ){
																			
																			temp = new String( "" +amharicText.charAt(i) );
																			englishText = englishText + temp;
																		}
																		
																		else{
																			
																			englishText = englishText + temp;
																		}
																	}
																	
																	
																	
																	int word_count =0;
																	String firstWord = new String("");
																	String secondWord = new String("");
																	
																	boolean endedFristName = false;
																	
																	for( int i=0; i< englishText.length() ; i++ ){ // to separate frist and second names
																		
																		if( englishText.charAt(i)!=' ' && !endedFristName ){
																			
																			firstWord = firstWord + new String(""+englishText.charAt(i) );
																			
																		}
																		
																		else{
																			
																			endedFristName = true;
																			if( i == ( englishText.length()-1 )  ){
																				
																				break;
																			}
																			
																			else{
																			
																			secondWord = secondWord + new String(""+englishText.charAt(i+1) );
																				}
																		}
																		
																	}
											
																	
																	int spaceCount=0;
																	for( int i=0; i< englishText.length(); i++ ){
																		
																		
																		if( englishText.charAt(i)==' '){
																			
																			spaceCount++;
																			
																		}
																		
																		
																	}
																	
																	word_count = spaceCount+1;
											
																	if( englishText.length()<=0 ){
																		
																		
																	}
																	
																	else if( word_count==1 ){
																		
																		mailAddress = firstWord+"@"+DataStore.settings.mailServerAdress;
																		
																	}
																	
																	else if(word_count>=2 ){
																		
																	mailAddress = firstWord + new String(""+secondWord.charAt(0) ); 
																	mailAddress = mailAddress + "@" + DataStore.settings.mailServerAdress;
																				
																				}
																	
																	
																	
																	
															DataStore.tableModel.setValueAt(englishText,row_int,2,false );
															DataStore.tableModel.setValueAt(mailAddress,row_int,3,false );
															ProgramState.tableModified = true;
															
													}
													
													}
														
													} );
													
		
		}
		
	
	}