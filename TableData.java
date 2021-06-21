

			import java.io.Serializable;

		class TableData implements Serializable{
		
			
			private int numberOfRow;
			private int numberOfCol = 4;
			
			private Object data[][];
			
			public TableData(int row_size){
				
				data = new Object[row_size][4];
				numberOfRow = row_size;
				
			}
								
			public int getNumberOfRow(){
				
				return numberOfRow;
				
			}
			
			public Object getData(int row, int col){
								
				return data[row][col];
			}
			
			public void setData(Object dataArg ,int row, int col){
				
				
				System.out.println("Model row size :"+getNumberOfRow() );
				System.out.println("Model col size :"+ numberOfCol );
				System.out.println("Row arg "+ row);
				System.out.println("Col arg "+ col);
				
				data[row][col] = dataArg;
				
			}
		
		}