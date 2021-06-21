
			// Number of row should be specified at Object Creation

	
			import javax.swing.table.*;
			import java.io.Serializable;
		
			class TableModelMod extends AbstractTableModel implements Serializable{
				
				
				public static int numberOfRow;
				
				
				public Object data[][];
				
				public TableModelMod(TableData dataArgs){
					
				
					numberOfRow = dataArgs.getNumberOfRow();
					data = new Object[numberOfRow][4];
					
					
					for(int i=0; i<numberOfRow; i++){
						
						for(int j=0; j<4 ;j++){
							
							data[i][j] = dataArgs.getData(i,j);
							
						}
						
						
					}
					
					
				}
				
				public TableModelMod(int rowS){
					
					this.numberOfRow = rowS;
					data = new Object[rowS][4];
					
					
				}
																	
				@Override
				public int getColumnCount(){
					
					return 4;
				}
				
				@Override
				public Class<?> getColumnClass(int col){
						
						return String.class;
						
						}
				
				@Override
				public int getRowCount(){
					
					return numberOfRow;
				}
				
				@Override
				public Object getValueAt(int row,int col){
					
					
					if( col==0 ){
						
						return new Integer( (row+1) );
						
					}
					return data[row][col];
				
				}
				
				@Override
				public boolean isCellEditable(int row, int col){
					
					
					if( col==1){
						
						return true;
						
					}
					
					else if( DataStore.settings.editEnglishColumn && col==2 ) {
							
							return true;
						  
					
					}					
					
					
					else if( DataStore.settings.editMailColumn  && col==3) {
						
						
							return true;
						  					
					}
				
					else{
											
						return false;
					}
				}
								
				@Override
				public void setValueAt(Object value,int row, int col){
					
					data[row][col] = value;
					DataStore.tableData.setData( value, row,col ); // 				
					
					fireTableCellUpdated(row,col);
					
				}
				
				public void setValueAt(Object value,int row, int col, boolean bool){
					
					data[row][col] = value;
					DataStore.tableData.setData( value, row,col ); // 				
					
				}
			
			}