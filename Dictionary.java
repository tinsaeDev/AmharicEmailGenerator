


	import javax.swing.*;
	import java.awt.*;


	public class Dictionary{
		
		
		
		String enSo[][] = new String[35][7];
		String fidel[][] = new String[35][7];
		
		
		public Dictionary(){
		//ha
		
		fidel[0][0] = new String("\u1200"); 
		fidel[0][1] = new String("\u1201");
		fidel[0][2] = new String("\u1202");
		fidel[0][3] = new String("\u1203");
		fidel[0][4] = new String("\u1204");
		fidel[0][5] = new String("\u1205");
		fidel[0][6] = new String("\u1206");
		
		//le
		
		fidel[1][0] = new String("\u1208");
		fidel[1][1] = new String("\u1209");
		fidel[1][2] = new String("\u120A");
		fidel[1][3] = new String("\u120B");
		fidel[1][4] = new String("\u120C");
		fidel[1][5] = new String("\u120D");
		fidel[1][6] = new String("\u120E");
		
		//hameru ha
		
		
		fidel[2][0] = new String("\u1210");
		fidel[2][1] = new String("\u1211");
		fidel[2][2] = new String("\u1212");
		fidel[2][3] = new String("\u1213");
		fidel[2][4] = new String("\u1214");
		fidel[2][5] = new String("\u1215");
		fidel[2][6] = new String("\u1216");
		
		// me
		

		fidel[3][0] = new String("\u1218");
		fidel[3][1] = new String("\u1219");
		fidel[3][2] = new String("\u121A");
		fidel[3][3] = new String("\u121B");
		fidel[3][4] = new String("\u121C");
		fidel[3][5] = new String("\u121D");
		fidel[3][6] = new String("\u121E");

		
		// isatu se
		
		
		fidel[4][0] = new String("\u1220");
		fidel[4][1] = new String("\u1221");
		fidel[4][2] = new String("\u1222");
		fidel[4][3] = new String("\u1223");
		fidel[4][4] = new String("\u1224");
		fidel[4][5] = new String("\u1225");
		fidel[4][6] = new String("\u1226");
		
		// re 
		
		fidel[5][0] = new String("\u1228");
		fidel[5][1] = new String("\u1229");
		fidel[5][2] = new String("\u122A");
		fidel[5][3] = new String("\u122B");
		fidel[5][4] = new String("\u122C");
		fidel[5][5] = new String("\u122D");
		fidel[5][6] = new String("\u122E");
		
		// se
		fidel[6][0] = new String("\u1230");
		fidel[6][1] = new String("\u1231");
		fidel[6][2] = new String("\u1232");
		fidel[6][3] = new String("\u1233");
		fidel[6][4] = new String("\u1234");
		fidel[6][5] = new String("\u1235");
		fidel[6][6] = new String("\u1236");
		
		// she
		
		fidel[7][0] = new String("\u1238");
		fidel[7][1] = new String("\u1239");
		fidel[7][2] = new String("\u123A");
		fidel[7][3] = new String("\u123B");
		fidel[7][4] = new String("\u123C");
		fidel[7][5] = new String("\u123D");
		fidel[7][6] = new String("\u123E");
		
		// qe

		fidel[8][0] = new String("\u1240");
		fidel[8][1] = new String("\u1241");
		fidel[8][2] = new String("\u1242");
		fidel[8][3] = new String("\u1243");
		fidel[8][4] = new String("\u1244");
		fidel[8][5] = new String("\u1245");
		fidel[8][6] = new String("\u1246");
    
		// be 
		
		fidel[9][0] = new String("\u1260");
		fidel[9][1] = new String("\u1261");
		fidel[9][2] = new String("\u1262");
		fidel[9][3] = new String("\u1263");
		fidel[9][4] = new String("\u1264");
		fidel[9][5] = new String("\u1265");
		fidel[9][6] = new String("\u1266");
		
		// ve
		
		fidel[10][0] = new String("\u1268");
		fidel[10][1] = new String("\u1269");
		fidel[10][2] = new String("\u126A");
		fidel[10][3] = new String("\u126B");
		fidel[10][4] = new String("\u126C");
		fidel[10][5] = new String("\u126D");
		fidel[10][6] = new String("\u126E");

        //TE

		fidel[11][0] = new String("\u1270");
		fidel[11][1] = new String("\u1271");
		fidel[11][2] = new String("\u1272");
		fidel[11][3] = new String("\u1273");
		fidel[11][4] = new String("\u1274");
		fidel[11][5] = new String("\u1275");
		fidel[11][6] = new String("\u1276");
		
		// che
		
		fidel[12][0] = new String("\u1278");
		fidel[12][1] = new String("\u1279");
		fidel[12][2] = new String("\u127A");
		fidel[12][3] = new String("\u127B");
		fidel[12][4] = new String("\u127C");
		fidel[12][5] = new String("\u127D");
		fidel[12][6] = new String("\u127E");

		//ha
		
		fidel[13][0] = new String("\u1280");
		fidel[13][1] = new String("\u1281");
		fidel[13][2] = new String("\u1282");
		fidel[13][3] = new String("\u1283");
		fidel[13][4] = new String("\u1284");
		fidel[13][5] = new String("\u1285");
		fidel[13][6] = new String("\u1286");
		
		// nie
		
		fidel[14][0] = new String("\u1290");
		fidel[14][1] = new String("\u1291");
		fidel[14][2] = new String("\u1292");
		fidel[14][3] = new String("\u1293");
		fidel[14][4] = new String("\u1294");
		fidel[14][5] = new String("\u1295");
		fidel[14][6] = new String("\u1296");
		
       // nye
	   
		fidel[15][0] = new String("\u1298");
		fidel[15][1] = new String("\u1299");
		fidel[15][2] = new String("\u129A");
		fidel[15][3] = new String("\u129B");
		fidel[15][4] = new String("\u129C");
		fidel[15][5] = new String("\u129D");
		fidel[15][6] = new String("\u129E");
		
	  // AA
	  
		fidel[16][0] = new String("\u12A0");
		fidel[16][1] = new String("\u12A1");
		fidel[16][2] = new String("\u12A2");
		fidel[16][3] = new String("\u12A3");
		fidel[16][4] = new String("\u12A4");
		fidel[16][5] = new String("\u12A5");
		fidel[16][6] = new String("\u12A6");
		
	// ke
	
		fidel[17][0] = new String("\u12A8");
		fidel[17][1] = new String("\u12A9");
		fidel[17][2] = new String("\u12AA");
		fidel[17][3] = new String("\u12AB");
		fidel[17][4] = new String("\u12AC");
		fidel[17][5] = new String("\u12AD");
		fidel[17][6] = new String("\u12AE");
		
	
	// kihe

		fidel[18][0] = new String("\u12B8");	
		fidel[18][1] = new String("\u12B9");	
		fidel[18][2] = new String("\u12BA");	
		fidel[18][3] = new String("\u12BB");	
		fidel[18][4] = new String("\u12BC");	
		fidel[18][5] = new String("\u12BD");	
		fidel[18][6] = new String("\u12BE");			
		
	// wie
	
		fidel[19][0] = new String("\u12C8");
		fidel[19][1] = new String("\u12C9");
		fidel[19][2] = new String("\u12CA");
		fidel[19][3] = new String("\u12CB");
		fidel[19][4] = new String("\u12CC");
		fidel[19][5] = new String("\u12CD");
		fidel[19][6] = new String("\u12CE");
		
   // Anothe A

 		fidel[20][0] = new String("\u12D0");
 		fidel[20][1] = new String("\u12D1");
 		fidel[20][2] = new String("\u12D2");
 		fidel[20][3] = new String("\u12D3");
 		fidel[20][4] = new String("\u12D4");
 		fidel[20][5] = new String("\u12D5");
 		fidel[20][6] = new String("\u12D6");

   // Zie
 
  		fidel[21][0] = new String("\u12D8");
  		fidel[21][1] = new String("\u12D9");
  		fidel[21][2] = new String("\u12DA");
  		fidel[21][3] = new String("\u12DB");
  		fidel[21][4] = new String("\u12DC");
  		fidel[21][5] = new String("\u12DD");
  		fidel[21][6] = new String("\u12DE");

	// Zhie

  		fidel[22][0] = new String("\u12E0");
  		fidel[22][1] = new String("\u12E1");
  		fidel[22][2] = new String("\u12E2");
  		fidel[22][3] = new String("\u12E3");
  		fidel[22][4] = new String("\u12E4");
  		fidel[22][5] = new String("\u12E5");
  		fidel[22][6] = new String("\u12E6");
		
	// yie
	
  		fidel[23][0] = new String("\u12E8");
  		fidel[23][1] = new String("\u12E9");
  		fidel[23][2] = new String("\u12EA");
  		fidel[23][3] = new String("\u12EB");
  		fidel[23][4] = new String("\u12EC");
  		fidel[23][5] = new String("\u12ED");
  		fidel[23][6] = new String("\u12EE");
		
		
	// die

		fidel[24][0] = new String("\u12F0");
		fidel[24][1] = new String("\u12F1");
		fidel[24][2] = new String("\u12F2");
		fidel[24][3] = new String("\u12F3");
		fidel[24][4] = new String("\u12F4");
		fidel[24][5] = new String("\u12F5");
		fidel[24][6] = new String("\u12F6");

	// phi
	
		fidel[25][0] = new String("\u12F8");
		fidel[25][1] = new String("\u12F9");
		fidel[25][2] = new String("\u12FA");
		fidel[25][3] = new String("\u12FB");
		fidel[25][4] = new String("\u12FC");
		fidel[25][5] = new String("\u12FD");
		fidel[25][6] = new String("\u12FE");
		
	// jie
	
		fidel[26][0] = new String("\u1300");
		fidel[26][1] = new String("\u1301");
		fidel[26][2] = new String("\u1302");
		fidel[26][3] = new String("\u1303");
		fidel[26][4] = new String("\u1304");
		fidel[26][5] = new String("\u1305");
		fidel[26][6] = new String("\u1306");
	
	// gie

		fidel[27][0] = new String("\u1308");
		fidel[27][1] = new String("\u1309");
		fidel[27][2] = new String("\u130A");
		fidel[27][3] = new String("\u130B");
		fidel[27][4] = new String("\u130C");
		fidel[27][5] = new String("\u130D");
		fidel[27][6] = new String("\u130E");
	
	// xie

		fidel[28][0] = new String("\u1320");
		fidel[28][1] = new String("\u1321");
		fidel[28][2] = new String("\u1322");
		fidel[28][3] = new String("\u1323");
		fidel[28][4] = new String("\u1324");
		fidel[28][5] = new String("\u1325");
		fidel[28][6] = new String("\u1326");
	
	// chie
	
		fidel[29][0] = new String("\u1328");
		fidel[29][1] = new String("\u1329");
		fidel[29][2] = new String("\u132A");
		fidel[29][3] = new String("\u132B");
		fidel[29][4] = new String("\u132C");
		fidel[29][5] = new String("\u132D");
		fidel[29][6] = new String("\u132E");
		
	// pie
	
		fidel[30][0] = new String("\u1330");
		fidel[30][1] = new String("\u1331");
		fidel[30][2] = new String("\u1332");
		fidel[30][3] = new String("\u1333");
		fidel[30][4] = new String("\u1334");
		fidel[30][5] = new String("\u1335");
		fidel[30][6] = new String("\u1336");
		
	// xxxx
	
		fidel[31][0] = new String("\u1338");
		fidel[31][1] = new String("\u1339");
		fidel[31][2] = new String("\u133A");
		fidel[31][3] = new String("\u133B");
		fidel[31][4] = new String("\u133C");
		fidel[31][5] = new String("\u133D");
		fidel[31][6] = new String("\u133E");

	// Tse
	
		fidel[32][0] = new String("\u1340");
		fidel[32][1] = new String("\u1341");
		fidel[32][2] = new String("\u1342");
		fidel[32][3] = new String("\u1343");
		fidel[32][4] = new String("\u1344"); 
		fidel[32][5] = new String("\u1345");
		fidel[32][6] = new String("\u1346");

	// fie
	
		fidel[33][0] = new String("\u1348");
		fidel[33][1] = new String("\u1349");
		fidel[33][2] = new String("\u134A");
		fidel[33][3] = new String("\u134B");
		fidel[33][4] = new String("\u134C");
		fidel[33][5] = new String("\u134D");
		fidel[33][6] = new String("\u134E");
		
	// pa
		fidel[34][0] = new String("\u1350");
		fidel[34][1] = new String("\u1351");
		fidel[34][2] = new String("\u1352");
		fidel[34][3] = new String("\u1353");
		fidel[34][4] = new String("\u1354");
		fidel[34][5] = new String("\u1355");
		fidel[34][6] = new String("\u1356");
		
		
		
		
		
///////////////////////////////////////////////////////////////////////////

	
	

		//ha
		
		enSo[0][0] = "he"; 
		enSo[0][1] = "hu";
		enSo[0][2] = "hi";
		enSo[0][3] = "ha";
		enSo[0][4] = "hie";
		enSo[0][5] = "h";
		enSo[0][6] = "ho";
		
		//le
		
		enSo[1][0] = "le";
		enSo[1][1] = "lu";
		enSo[1][2] = "li";
		enSo[1][3] = "la";
		enSo[1][4] = "lie";
		enSo[1][5] = "l";
		enSo[1][6] = "lo";
		
		//hameru ha
		
		
		enSo[2][0] = "he";
		enSo[2][1] = "hu";
		enSo[2][2] = "hi";
		enSo[2][3] = "ha";
		enSo[2][4] = "hie";
		enSo[2][5] = "h";
		enSo[2][6] = "ho";
		
		// me
		

		enSo[3][0] = "me";
		enSo[3][1] = "mu";
		enSo[3][2] = "mi";
		enSo[3][3] = "ma";
		enSo[3][4] = "mie";
		enSo[3][5] = "m";
		enSo[3][6] = "mo";

		
		// isatu se
		
		
		enSo[4][0] = "se";
		enSo[4][1] = "su";
		enSo[4][2] = "si";
		enSo[4][3] = "sa";
		enSo[4][4] = "sie";
		enSo[4][5] = "s";
		enSo[4][6] = "so";
		
		// re 
		
		enSo[5][0] = "re";
		enSo[5][1] = "ru";
		enSo[5][2] = "ri";
		enSo[5][3] = "ra";
		enSo[5][4] = "rie";
		enSo[5][5] = "r";
		enSo[5][6] = "ro";
		
		// se
		enSo[6][0] = "se";
		enSo[6][1] = "su";
		enSo[6][2] = "si";
		enSo[6][3] = "sa";
		enSo[6][4] = "sie";
		enSo[6][5] = "s";
		enSo[6][6] = "so";
		
		// she
		
		enSo[7][0] = "she";
		enSo[7][1] = "shu";
		enSo[7][2] = "shi";
		enSo[7][3] = "sha";
		enSo[7][4] = "shie";
		enSo[7][5] = "sh";
		enSo[7][6] = "sho";
		
		// qe

		enSo[8][0] = "ke";
		enSo[8][1] = "ku";
		enSo[8][2] = "ki";
		enSo[8][3] = "ka";
		enSo[8][4] = "kie";
		enSo[8][5] = "k";
		enSo[8][6] = "ko";
    
		// be 
		
		enSo[9][0] = "be";
		enSo[9][1] = "bu";
		enSo[9][2] = "bi";
		enSo[9][3] = "ba";
		enSo[9][4] = "bie";
		enSo[9][5] = "b";
		enSo[9][6] = "bo";
		
		// ve
		
		enSo[10][0] = "ve";
		enSo[10][1] = "vu";
		enSo[10][2] = "vi";
		enSo[10][3] = "va";
		enSo[10][4] = "vie";
		enSo[10][5] = "v";
		enSo[10][6] = "vo";

        //TE

		enSo[11][0] = "te";
		enSo[11][1] = "tu";
		enSo[11][2] = "ti";
		enSo[11][3] = "ta";
		enSo[11][4] = "tie";
		enSo[11][5] = "t";
		enSo[11][6] = "to";
		
		// che
		
		enSo[12][0] = "che";
		enSo[12][1] = "chu";
		enSo[12][2] = "chi";
		enSo[12][3] = "cha";
		enSo[12][4] = "chie";
		enSo[12][5] = "ch";
		enSo[12][6] = "cho";

		//ha
		
		enSo[13][0] = "he";
		enSo[13][1] = "hu";
		enSo[13][2] = "hi";
		enSo[13][3] = "ha";
		enSo[13][4] = "hie";
		enSo[13][5] = "h";
		enSo[13][6] = "ho";
		
		// nie
		
		enSo[14][0] = "ne";
		enSo[14][1] = "nu";
		enSo[14][2] = "ni";
		enSo[14][3] = "na";
		enSo[14][4] = "nie";
		enSo[14][5] = "n";
		enSo[14][6] = "no";
		
       // nye
	   
		enSo[15][0] = "gne";
		enSo[15][1] = "gnu";
		enSo[15][2] = "gni";
		enSo[15][3] = "gna";
		enSo[15][4] = "gnie";
		enSo[15][5] = "gn";
		enSo[15][6] = "gno";
		
	  // AA
	  
		enSo[16][0] = "a";
		enSo[16][1] = "oo";
		enSo[16][2] = "I";
		enSo[16][3] = "a";
		enSo[16][4] = "a";
		enSo[16][5] = "E";
		enSo[16][6] = "O";
		
	// ke
	
		enSo[17][0] = "ke";
		enSo[17][1] = "ku";
		enSo[17][2] = "ki";
		enSo[17][3] = "ka";
		enSo[17][4] = "kie";
		enSo[17][5] = "k";
		enSo[17][6] = "ko";
		
	
	// kihe

		enSo[18][0] = "\u12B8";	
		enSo[18][1] = "\u12B9";	
		enSo[18][2] = "\u12BA";	
		enSo[18][3] = "\u12BB";	
		enSo[18][4] = "\u12BC";	
		enSo[18][5] = "\u12BD";	
		enSo[18][6] = "\u12BE";			
		
	// wie
	
		enSo[19][0] = "we";
		enSo[19][1] = "wu";
		enSo[19][2] = "wi";
		enSo[19][3] = "wa";
		enSo[19][4] = "wie";
		enSo[19][5] = "w";
		enSo[19][6] = "wo";
		
   // Anothe A

		enSo[20][0] = "a";
		enSo[20][1] = "oo";
		enSo[20][2] = "I";
		enSo[20][3] = "a";
		enSo[20][4] = "a";
		enSo[20][5] = "E";
		enSo[20][6] = "O";

   // Zie
 
  		enSo[21][0] = "ze";
  		enSo[21][1] = "zu";
  		enSo[21][2] = "zi";
  		enSo[21][3] = "za";
  		enSo[21][4] = "zie";
  		enSo[21][5] = "z";
  		enSo[21][6] = "zo";

	// Zhie

  		enSo[22][0] = "zhe";
  		enSo[22][1] = "zhu";
  		enSo[22][2] = "zhi";
  		enSo[22][3] = "zha";
  		enSo[22][4] = "zhie";
  		enSo[22][5] = "zh";
  		enSo[22][6] = "zho";
		
	// yie
	
  		enSo[23][0] = "ye";
  		enSo[23][1] = "yu";
  		enSo[23][2] = "yi";
  		enSo[23][3] = "ya";
  		enSo[23][4] = "yie";
  		enSo[23][5] = "y";
  		enSo[23][6] = "yo";
		
		
	// die

		enSo[24][0] = "de";
		enSo[24][1] = "du";
		enSo[24][2] = "di";
		enSo[24][3] = "da";
		enSo[24][4] = "die";
		enSo[24][5] = "d";
		enSo[24][6] = "do";

	// phi
	
		enSo[25][0] = "phe";
		enSo[25][1] = "phu";
		enSo[25][2] = "phi";
		enSo[25][3] = "pha";
		enSo[25][4] = "phie";
		enSo[25][5] = "ph";
		enSo[25][6] = "pho";
		
	// jie
	
		enSo[26][0] = "je";
		enSo[26][1] = "ju";
		enSo[26][2] = "ji";
		enSo[26][3] = "ja";
		enSo[26][4] = "jie";
		enSo[26][5] = "j";
		enSo[26][6] = "jo";
	
	// gie

		enSo[27][0] = "ge";
		enSo[27][1] = "gu";
		enSo[27][2] = "gi";
		enSo[27][3] = "ga";
		enSo[27][4] = "gie";
		enSo[27][5] = "g";
		enSo[27][6] = "go";
	
	// xie

		enSo[28][0] = "xe";
		enSo[28][1] = "xu";
		enSo[28][2] = "xi";
		enSo[28][3] = "xa";
		enSo[28][4] = "xie";
		enSo[28][5] = "x";
		enSo[28][6] = "xo";
	
	// chie
	
		enSo[29][0] = "che";
		enSo[29][1] = "chu";
		enSo[29][2] = "chi";
		enSo[29][3] = "cha";
		enSo[29][4] = "chie";
		enSo[29][5] = "ch";
		enSo[29][6] = "cho";
		
	// pie
	
		enSo[30][0] = "pe";
		enSo[30][1] = "pu";
		enSo[30][2] = "pi";
		enSo[30][3] = "pa";
		enSo[30][4] = "pie";
		enSo[30][5] = "p";
		enSo[30][6] = "po";
		
	// xxxx
	
		enSo[31][0] = "\u1338";
		enSo[31][1] = "\u1339";
		enSo[31][2] = "\u133A";
		enSo[31][3] = "\u133B";
		enSo[31][4] = "\u133C";
		enSo[31][5] = "\u133D";
		enSo[31][6] = "\u133E";

	// Tse
	
		enSo[32][0] = "tse";
		enSo[32][1] = "tsu";
		enSo[32][2] = "tsi";
		enSo[32][3] = "tsa";
		enSo[32][4] = "tsie"; 
		enSo[32][5] = "ts";
		enSo[32][6] = "tso";

	// fie
	
		enSo[33][0] = "fe";
		enSo[33][1] = "fu";
		enSo[33][2] = "fi";
		enSo[33][3] = "fa";
		enSo[33][4] = "fie";
		enSo[33][5] = "f";
		enSo[33][6] = "fo";
		
	// pa
		enSo[34][0] = "pe";
		enSo[34][1] = "pu";
		enSo[34][2] = "pi";
		enSo[34][3] = "pa";
		enSo[34][4] = "pie";
		enSo[34][5] = "p";
		enSo[34][6] = "po";

	
	}

		public String convertToEnglish( char amharicCharArg ){
			
					String wtr = null;
					String amharic = new String(""+amharicCharArg);
					
					
						for(int i=0; i<35; i++){							
							for(int j=0; j<7; j++){
								if( amharic.equals( fidel[i][j] ) ){
										wtr = enSo[i][j];
										break;
								}
								
							}
						}
					
					
					
					return wtr;
			
		}

		public String toGeez(String englishStringArg){
			
					String wtr = ""+englishStringArg;
					
					System.out.println("Recieved "+englishStringArg);
					
						for(int i=0; i<35; i++){							
							for(int j=0; j<7; j++){
								
								// System.out.println( "i:"+i+" -dic- j:"+j );
								if( englishStringArg.equals( enSo[i][j] ) ){
										
										wtr = fidel[i][j];
										break;
								}
								
							}
						}
					
					return wtr;	
		
				}
		
		}		

		
		
		
		
		
		
		