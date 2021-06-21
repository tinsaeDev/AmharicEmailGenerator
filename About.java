


		// settings dialog
		
		import javax.swing.*;
		import java.awt.*;
		import java.awt.event.*;
		import java.io.*;
		
		public class About {
		
		
		
		
		
		
		
				Dialog dialog = new Dialog(UIModel.mainWindow);
				
				JTextArea aboutTa = new JTextArea("Created at Bahir Dar University  2009 E.C /2017 G.C \n"+
												  "By \t -Tinsae Belay,\n \t -Dinkneh Lema and \n \t -Tamru Agalneh \n\n"+
												  "Notice this is BETA version!!"
												  );
				JButton ok =  new JButton("Ok"); 
				
				JPanel superPanel = new JPanel( new BorderLayout() );
				JPanel aboutPanel = new JPanel( new GridLayout() );
				JPanel okPanel = new JPanel( new FlowLayout() ); 

				public About(){
				
				
					ok.addActionListener( new ActionListener(){
						
						@Override
						public void actionPerformed(ActionEvent event){
							
							dialog.dispose();
						
							
						}
						
						
					} );
					// aboutTa.setFont( new Font("lucida console",Font.PLAIN,20 ) );
		
					aboutTa.setEditable(false);
					
					
					okPanel.add(ok);
					
					aboutPanel.add( aboutTa );
					superPanel.add( aboutPanel, BorderLayout.CENTER);
					superPanel.add( okPanel,BorderLayout.PAGE_END );
					dialog.add( superPanel );
					
					dialog.setSize( 400,400 );
					
					
					
					int xWindow = UIModel.mainWindow.getWidth();
					int yWindow = UIModel.mainWindow.getHeight();

					int locXWindow = (int) UIModel.mainWindow.getLocation().getX();
					int locYWindow = (int) UIModel.mainWindow.getLocation().getY();
					
				
					
					int halfWidthWindow = xWindow /2;
					int halfHeightWindow = yWindow/2;
					
					dialog.setLocation( locXWindow+(halfWidthWindow-200), locYWindow+(halfHeightWindow-200) );
					
					
					
					dialog.setResizable( false );
					dialog.setModal( true );
					dialog.show();
				}
				

	}