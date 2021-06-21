

			import javax.swing.table.*;
			import javax.swing.JTable;
			import java.awt.*;


			
			class MyTableCellRenderer extends DefaultTableCellRenderer{
				
				
				@Override
				public Component getTableCellRendererComponent(JTable table, Object value,
					boolean isSelected, boolean hasFocus, int row, int column){
					
					Component c = super.getTableCellRendererComponent( table,value,isSelected,hasFocus,row,column );				
					
					c.setFont( new Font("nyala",Font.PLAIN,20) );
					
					return c;
					
				}
				
			
			}
			
	