		// WARNNING ---- NOT FINISHED !!!!!!!!!!!! 

			import javax.swing.*;
			import javax.swing.table.*;
			import javax.swing.filechooser.*;
			import javax.swing.event.*;
			
			import java.awt.event.*;
			import java.awt.*;
			
			import java.io.*;
			
			
			public class MainUI{
			

			MenuItemEventListener menuItemEventListener;
			
			public MainUI(){
			
			menuItemEventListener = new MenuItemEventListener();
				
				
			init();
			add();
			registerEventListener();
			
			UIModel.mainWindow.setVisible(true);
			
			}
			
			public void init(){
			
				UIModel.mainWindow = new JFrame("Mail Adress Generator");
				UIModel.mainWindow.setSize(1000,600);
				UIModel.mainWindow.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
				
			// Initializing pane
			
				UIModel.pane = new JPanel( new BorderLayout() );
				UIModel.scrollPane = new JScrollPane( UIModel.pane );
				UIModel.superPane = new JPanel( new BorderLayout() );
			
			// Iniatializing Menu and Associated
			
				UIModel.menuBar = new JMenuBar();
					UIModel.fileMenu = new JMenu("File");
						
						UIModel.openMenuItem = new JMenuItem("Open");
						UIModel.newMenuItem = new JMenuItem("New");
						UIModel.saveMenuItem  = new JMenuItem("Save");
						UIModel.saveAsMenuItem = new JMenuItem("Save As");
						UIModel.closeMenuItem  = new JMenuItem("Close");
						UIModel.exitMenuItem = new JMenuItem("Exit");

						
					UIModel.toolsMenu = new JMenu("Tools");
						UIModel.latinToGeez = new JMenuItem("Convert latin to geez");
					UIModel.settingsMenu = new JMenu("Settings");
						UIModel.preference = new JMenuItem("Preferences");
					UIModel.helpMenu = new JMenu("Help");
						UIModel.helpMenuItem = new JMenuItem("Help");
						UIModel.aboutMenuItem = new JMenuItem("About");

			
			// Initializing Table and Associated
			
				
			}
			
			public void add(){
				
				// Adding Menu And Associated

				
						UIModel.settingsMenu.add( UIModel.preference);
						UIModel.toolsMenu.add(UIModel.latinToGeez);
						UIModel.helpMenu.add( UIModel.helpMenuItem );
						UIModel.helpMenu.add( UIModel.aboutMenuItem );
						
						UIModel.fileMenu.add( UIModel.openMenuItem );
						UIModel.fileMenu.add( UIModel.newMenuItem);
						UIModel.fileMenu.add( UIModel.saveMenuItem);
						UIModel.fileMenu.add( UIModel.saveAsMenuItem);
						UIModel.fileMenu.add( UIModel.closeMenuItem);
						UIModel.fileMenu.add( UIModel.exitMenuItem);
						
						UIModel.menuBar.add( UIModel.fileMenu );
						UIModel.menuBar.add( UIModel.toolsMenu );
						UIModel.menuBar.add( UIModel.settingsMenu );
						UIModel.menuBar.add( UIModel.helpMenu );
						
						
						UIModel.superPane.add( UIModel.scrollPane,BorderLayout.CENTER );
						// Add table header at north to this panel

					
						
						 UIModel.mainWindow.setJMenuBar(UIModel.menuBar);
						 UIModel.mainWindow.add( UIModel.superPane );
				
			}
			
		    public void registerEventListener(){
				
				
				
				UIModel.openMenuItem.addActionListener( menuItemEventListener );		
				UIModel.newMenuItem.addActionListener( menuItemEventListener );
				UIModel.saveMenuItem.addActionListener( menuItemEventListener );
				UIModel.saveAsMenuItem.addActionListener( menuItemEventListener );
				UIModel.closeMenuItem.addActionListener( menuItemEventListener );
				UIModel.exitMenuItem.addActionListener( menuItemEventListener );
				
				
				UIModel.latinToGeez.addActionListener( menuItemEventListener );
				UIModel.preference.addActionListener( menuItemEventListener ) ;
				
				UIModel.aboutMenuItem.addActionListener( new ActionListener(){

							
							@Override
							public void actionPerformed(ActionEvent event){
								
								
								new About();
								
							}


				});
				
				UIModel.helpMenuItem.addActionListener(  new ActionListener(){

							
							@Override
							public void actionPerformed(ActionEvent event){
								
								
								new Help();
								
							}


				} );
				
				UIModel.mainWindow.addWindowListener( new WindowAdapter(){

				
					@Override
					public void windowClosing(WindowEvent event){
					
					if( ProgramState.tableModified ){
						
						ExitApp.confirm();
						
					}
					else{
						
						ExitApp.exit();
						
					}
						
					}
					
					
				} );
				
				
				
			}
			
			
		}			
			
			