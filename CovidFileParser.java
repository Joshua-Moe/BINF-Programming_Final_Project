import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class CovidFileParser {
	// The csv file that contains the COVID-19 data
	final String myFile = "C:\\UNC_Fall_2020\\BINF_Advanced_Programming\\Project\\United_States_COVID-19_Cases_and_Deaths_by_State_over_Time.csv";
	
	// I am creating 50 Hashmaps, one for each state, where the key is the "date" and the value is the "total COVID-19 cases.
	HashMap<String,String> AL = new HashMap<String,String>();
	HashMap<String,String> AK = new HashMap<String,String>();
	HashMap<String,String> AZ = new HashMap<String,String>();
	HashMap<String,String> AR = new HashMap<String,String>();
	HashMap<String,String> CA = new HashMap<String,String>();
	HashMap<String,String> CO = new HashMap<String,String>();
	HashMap<String,String> CT = new HashMap<String,String>();
	HashMap<String,String> DE = new HashMap<String,String>();
	HashMap<String,String> DC = new HashMap<String,String>();
	HashMap<String,String> FL = new HashMap<String,String>();
	HashMap<String,String> GA = new HashMap<String,String>();
	HashMap<String,String> HI = new HashMap<String,String>();
	HashMap<String,String> ID = new HashMap<String,String>();
	HashMap<String,String> IL = new HashMap<String,String>();
	HashMap<String,String> IN = new HashMap<String,String>();
	HashMap<String,String> IA = new HashMap<String,String>();
	HashMap<String,String> KS = new HashMap<String,String>();
	HashMap<String,String> KY = new HashMap<String,String>();
	HashMap<String,String> LA = new HashMap<String,String>();
	HashMap<String,String> ME = new HashMap<String,String>();
	HashMap<String,String> MD = new HashMap<String,String>();
	HashMap<String,String> MA = new HashMap<String,String>();
	HashMap<String,String> MI = new HashMap<String,String>();
	HashMap<String,String> MN = new HashMap<String,String>();
	HashMap<String,String> MS = new HashMap<String,String>();
	HashMap<String,String> MO = new HashMap<String,String>();
	HashMap<String,String> MT = new HashMap<String,String>();
	HashMap<String,String> NE = new HashMap<String,String>();
	HashMap<String,String> NV = new HashMap<String,String>();
	HashMap<String,String> NH = new HashMap<String,String>();
	HashMap<String,String> NJ = new HashMap<String,String>();
	HashMap<String,String> NM = new HashMap<String,String>();
	HashMap<String,String> NY = new HashMap<String,String>();
	HashMap<String,String> NC = new HashMap<String,String>();
	HashMap<String,String> ND = new HashMap<String,String>();
	HashMap<String,String> OH = new HashMap<String,String>();
	HashMap<String,String> OK = new HashMap<String,String>();
	HashMap<String,String> OR = new HashMap<String,String>();
	HashMap<String,String> PA = new HashMap<String,String>();
	HashMap<String,String> RI = new HashMap<String,String>();
	HashMap<String,String> SC = new HashMap<String,String>();
	HashMap<String,String> SD = new HashMap<String,String>();
	HashMap<String,String> TN = new HashMap<String,String>();
	HashMap<String,String> TX = new HashMap<String,String>();
	HashMap<String,String> UT = new HashMap<String,String>();
	HashMap<String,String> VT = new HashMap<String,String>();
	HashMap<String,String> VA = new HashMap<String,String>();
	HashMap<String,String> WA = new HashMap<String,String>();
	HashMap<String,String> WV = new HashMap<String,String>();
	HashMap<String,String> WI = new HashMap<String,String>();
	HashMap<String,String> WY = new HashMap<String,String>();
	
	public void main(String[] arg) throws Exception
	{
		BufferedReader reader = new BufferedReader(new FileReader(new File(myFile)));
		for(String nextLine = reader.readLine(); nextLine != null; nextLine = reader.readLine())
		{
			String[] line = nextLine.split(",");
			//The first, second, and third columns are the "date", "State", and "total cases", respectively.
			//Time to populate the hashmaps.
			switch(line[1])
			{
				case "AL": AL.put(line[0], line[2]); break;
				case "AK": AK.put(line[0], line[2]); break;
				case "AZ": AZ.put(line[0], line[2]); break;
				case "AR": AR.put(line[0], line[2]); break;
				case "CA": CA.put(line[0], line[2]); break;
				case "CO": CO.put(line[0], line[2]); break;
				case "CT": CT.put(line[0], line[2]); break;
				case "DE": DE.put(line[0], line[2]); break;
				case "DC": DC.put(line[0], line[2]); break;
				case "FL": FL.put(line[0], line[2]); break;
				case "GA": GA.put(line[0], line[2]); break;
				case "HI": HI.put(line[0], line[2]); break;
				case "ID": ID.put(line[0], line[2]); break;
				case "IL": IL.put(line[0], line[2]); break;
				case "IN": IN.put(line[0], line[2]); break;
				case "IA": IA.put(line[0], line[2]); break;
				case "KS": KS.put(line[0], line[2]); break;
				case "KY": KY.put(line[0], line[2]); break;
				case "LA": LA.put(line[0], line[2]); break;
				case "ME": ME.put(line[0], line[2]); break;
				case "MD": MD.put(line[0], line[2]); break;
				case "MA": MA.put(line[0], line[2]); break;
				case "MI": MI.put(line[0], line[2]); break;
				case "MN": MN.put(line[0], line[2]); break;
				case "MS": MS.put(line[0], line[2]); break;
				case "MO": MO.put(line[0], line[2]); break;
				case "MT": MT.put(line[0], line[2]); break;
				case "NE": NE.put(line[0], line[2]); break;
				case "NV": NV.put(line[0], line[2]); break;
				case "NH": NH.put(line[0], line[2]); break;
				case "NJ": NJ.put(line[0], line[2]); break;
				case "NM": NM.put(line[0], line[2]); break;
				case "NY": NY.put(line[0], line[2]); break;
				case "NC": NC.put(line[0], line[2]); break;
				case "ND": ND.put(line[0], line[2]); break;
				case "OH": OH.put(line[0], line[2]); break;
				case "OK": OK.put(line[0], line[2]); break;
				case "OR": OR.put(line[0], line[2]); break;
				case "PA": PA.put(line[0], line[2]); break;
				case "RI": RI.put(line[0], line[2]); break;
				case "SC": SC.put(line[0], line[2]); break;
				case "SD": SD.put(line[0], line[2]); break;
				case "TN": TN.put(line[0], line[2]); break;
				case "TX": TX.put(line[0], line[2]); break;
				case "UT": UT.put(line[0], line[2]); break;
				case "VT": VT.put(line[0], line[2]); break;
				case "VA": VA.put(line[0], line[2]); break;
				case "WA": WA.put(line[0], line[2]); break;
				case "WV": WV.put(line[0], line[2]); break;
				case "WI": WI.put(line[0], line[2]); break;
				case "WY": WY.put(line[0], line[2]); break;
				default: continue;
			}
		}
		reader.close();
		System.out.println("North Carolina at March 1st: " + NC.get("3/1/2020"));
	}
	
}
