
			import java.io.*;

		public class Main{
		
	// Used for de-Serialization
			private File settingsFile;
			private boolean settingsFileFound;
			private boolean settingsFileSaved;
			
			private FileInputStream fileInputStream;
			private ObjectInputStream objectInputStream;
			
			private FileOutputStream fileOutputStream;
			private ObjectOutputStream objectOutputStream;
			
			
	
			public Main(){
				
				
				settingsFile = new File("Settings.db");
				
				// Trying to open preferrence (Setting) file 
				
				
				if( settingsFile.exists() ){
					
					
					try	{
						
						
					fileInputStream = new FileInputStream(settingsFile);
					objectInputStream = new ObjectInputStream( fileInputStream );
					
					DataStore.settings = (Settings) objectInputStream.readObject();
										
					fileInputStream.close();
					settingsFileFound = true;
										
							}
					
					catch( Exception e){
						
						
						System.err.println("Unable to read settings file "+e.getMessage() );
						e.printStackTrace();
						
					}
					
					
				}
				
				else {
					
					
					try{
						
					DataStore.settings = new Settings();
					
					fileOutputStream = new FileOutputStream( settingsFile );
					objectOutputStream = new ObjectOutputStream( fileOutputStream );
		
					objectOutputStream.writeObject( DataStore.settings );
					objectOutputStream.close();
					
					settingsFileFound = true;
						
						
					}
					
					catch(Exception e){
						
						System.err.println("Unable to create settings file "+ e.getMessage() );
					}
					
					
				}
				
			
			}
		
	
			
			public static void main(String[] ars){
				
				Main main = new Main();
				
					if( ! main.settingsFileFound ){
						
						System.exit(0);
						
					}
					
					else{
						
						System.out.println("Settings file found or Created");
						
					}
					
					MainUI ui =  new MainUI();
					
					
					

				
			}
		
		}