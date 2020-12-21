import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;




public class Covid19Map extends JFrame 
{
	//Image myI = Toolkit.getDefaultToolkit().getImage("C:\\UNC_Fall_2020\\BINF_Advanced_Programming\\Project\\royalty_free_map_of_United_States.jpg");
	static HashMap<Integer,String> dateIndex = new HashMap<Integer,String>();
	
	final static String myFile = "C:\\UNC_Fall_2020\\BINF_Advanced_Programming\\Project\\United_States_COVID-19_Cases_and_Deaths_by_State_over_Time.csv";
	// I am creating 50 Hashmaps, one for each state, where the key is the "date" and the value is the "total COVID-19 cases.
	static HashMap<String,String> AL = new HashMap<String,String>();
	static HashMap<String,String> AK = new HashMap<String,String>();
	static HashMap<String,String> AZ = new HashMap<String,String>();
	static HashMap<String,String> AR = new HashMap<String,String>();
	static HashMap<String,String> CA = new HashMap<String,String>();
	static HashMap<String,String> CO = new HashMap<String,String>();
	static HashMap<String,String> CT = new HashMap<String,String>();
	static HashMap<String,String> DE = new HashMap<String,String>();
	static HashMap<String,String> DC = new HashMap<String,String>();
	static HashMap<String,String> FL = new HashMap<String,String>();
	static HashMap<String,String> GA = new HashMap<String,String>();
	static HashMap<String,String> HI = new HashMap<String,String>();
	static HashMap<String,String> ID = new HashMap<String,String>();
	static HashMap<String,String> IL = new HashMap<String,String>();
	static HashMap<String,String> IN = new HashMap<String,String>();
	static HashMap<String,String> IA = new HashMap<String,String>();
	static HashMap<String,String> KS = new HashMap<String,String>();
	static HashMap<String,String> KY = new HashMap<String,String>();
	static HashMap<String,String> LA = new HashMap<String,String>();
	static HashMap<String,String> ME = new HashMap<String,String>();
	static HashMap<String,String> MD = new HashMap<String,String>();
	static HashMap<String,String> MA = new HashMap<String,String>();
	static HashMap<String,String> MI = new HashMap<String,String>();
	static HashMap<String,String> MN = new HashMap<String,String>();
	static HashMap<String,String> MS = new HashMap<String,String>();
	static HashMap<String,String> MO = new HashMap<String,String>();
	static HashMap<String,String> MT = new HashMap<String,String>();
	static HashMap<String,String> NE = new HashMap<String,String>();
	static HashMap<String,String> NV = new HashMap<String,String>();
	static HashMap<String,String> NH = new HashMap<String,String>();
	static HashMap<String,String> NJ = new HashMap<String,String>();
	static HashMap<String,String> NM = new HashMap<String,String>();
	static HashMap<String,String> NY = new HashMap<String,String>();
	static HashMap<String,String> NC = new HashMap<String,String>();
	static HashMap<String,String> ND = new HashMap<String,String>();
	static HashMap<String,String> OH = new HashMap<String,String>();
	static HashMap<String,String> OK = new HashMap<String,String>();
	static HashMap<String,String> OR = new HashMap<String,String>();
	static HashMap<String,String> PA = new HashMap<String,String>();
	static HashMap<String,String> RI = new HashMap<String,String>();
	static HashMap<String,String> SC = new HashMap<String,String>();
	static HashMap<String,String> SD = new HashMap<String,String>();
	static HashMap<String,String> TN = new HashMap<String,String>();
	static HashMap<String,String> TX = new HashMap<String,String>();
	static HashMap<String,String> UT = new HashMap<String,String>();
	static HashMap<String,String> VT = new HashMap<String,String>();
	static HashMap<String,String> VA = new HashMap<String,String>();
	static HashMap<String,String> WA = new HashMap<String,String>();
	static HashMap<String,String> WV = new HashMap<String,String>();
	static HashMap<String,String> WI = new HashMap<String,String>();
	static HashMap<String,String> WY = new HashMap<String,String>();
	
	public static void mapMethod(String arg) throws Exception
	{
		//January
		dateIndex.put(1,"01/22/2020");
		dateIndex.put(2, "01/23/2020");
		dateIndex.put(3, "01/24/2020");
		dateIndex.put(4, "01/25/2020");
		dateIndex.put(5, "01/26/2020");
		dateIndex.put(6, "01/27/2020");
		dateIndex.put(7, "01/28/2020");
		dateIndex.put(8, "01/29/2020");
		dateIndex.put(9, "01/30/2020");
		dateIndex.put(10, "01/31/2020");
		//February
		dateIndex.put(11,"02/01/2020");
		dateIndex.put(12,"02/02/2020");
		dateIndex.put(13,"02/03/2020");
		dateIndex.put(14,"02/04/2020");
		dateIndex.put(15,"02/05/2020");
		dateIndex.put(16,"02/06/2020");
		dateIndex.put(17,"02/07/2020");
		dateIndex.put(18,"02/08/2020");
		dateIndex.put(19,"02/09/2020");
		dateIndex.put(20,"02/10/2020");
		dateIndex.put(21,"02/11/2020");
		dateIndex.put(22,"02/12/2020");
		dateIndex.put(23,"02/13/2020");
		dateIndex.put(24,"02/14/2020");
		dateIndex.put(25,"02/15/2020");
		dateIndex.put(26,"02/16/2020");
		dateIndex.put(27,"02/17/2020");
		dateIndex.put(28,"02/18/2020");
		dateIndex.put(29,"02/19/2020");
		dateIndex.put(30,"02/20/2020");
		dateIndex.put(31,"02/21/2020");
		dateIndex.put(32,"02/22/2020");
		dateIndex.put(33,"02/23/2020");
		dateIndex.put(34,"02/24/2020");
		dateIndex.put(35,"02/25/2020");
		dateIndex.put(36,"02/26/2020");
		dateIndex.put(37,"02/27/2020");
		dateIndex.put(38,"02/28/2020");
		dateIndex.put(39,"02/29/2020");
		//March
		dateIndex.put(40,"03/01/2020");
		dateIndex.put(41,"03/02/2020");
		dateIndex.put(42,"03/03/2020");
		dateIndex.put(43,"03/04/2020");
		dateIndex.put(44,"03/05/2020");
		dateIndex.put(45,"03/06/2020");
		dateIndex.put(46,"03/07/2020");
		dateIndex.put(47,"03/08/2020");
		dateIndex.put(48,"03/09/2020");
		dateIndex.put(49,"03/10/2020");
		dateIndex.put(50,"03/11/2020");
		dateIndex.put(51,"03/12/2020");
		dateIndex.put(52,"03/13/2020");
		dateIndex.put(53,"03/14/2020");
		dateIndex.put(54,"03/15/2020");
		dateIndex.put(55,"03/16/2020");
		dateIndex.put(56,"03/17/2020");
		dateIndex.put(57,"03/18/2020");
		dateIndex.put(58,"03/19/2020");
		dateIndex.put(59,"03/20/2020");
		dateIndex.put(60,"03/21/2020");
		dateIndex.put(61,"03/22/2020");
		dateIndex.put(62,"03/23/2020");
		dateIndex.put(63,"03/24/2020");
		dateIndex.put(64,"03/25/2020");
		dateIndex.put(65,"03/26/2020");
		dateIndex.put(66,"03/27/2020");
		dateIndex.put(67,"03/28/2020");
		dateIndex.put(68,"03/29/2020");
		dateIndex.put(69,"03/30/2020");
		dateIndex.put(70,"03/31/2020");
		//April
		dateIndex.put(71,"04/01/2020");
		dateIndex.put(72,"04/02/2020");
		dateIndex.put(73,"04/03/2020");
		dateIndex.put(74,"04/04/2020");
		dateIndex.put(75,"04/05/2020");
		dateIndex.put(76,"04/06/2020");
		dateIndex.put(77,"04/07/2020");
		dateIndex.put(78,"04/08/2020");
		dateIndex.put(79,"04/09/2020");
		dateIndex.put(80,"04/10/2020");
		dateIndex.put(81,"04/11/2020");
		dateIndex.put(82,"04/12/2020");
		dateIndex.put(83,"04/13/2020");
		dateIndex.put(84,"04/14/2020");
		dateIndex.put(85,"04/15/2020");
		dateIndex.put(86,"04/16/2020");
		dateIndex.put(87,"04/17/2020");
		dateIndex.put(88,"04/18/2020");
		dateIndex.put(89,"04/19/2020");
		dateIndex.put(90,"04/20/2020");
		dateIndex.put(91,"04/21/2020");
		dateIndex.put(92,"04/22/2020");
		dateIndex.put(93,"04/23/2020");
		dateIndex.put(94,"04/24/2020");
		dateIndex.put(95,"04/25/2020");
		dateIndex.put(96,"04/26/2020");
		dateIndex.put(97,"04/27/2020");
		dateIndex.put(98,"04/28/2020");
		dateIndex.put(99,"04/29/2020");
		dateIndex.put(100,"04/30/2020");
		//May
		dateIndex.put(101,"05/01/2020");
		dateIndex.put(102,"05/02/2020");
		dateIndex.put(103,"05/03/2020");
		dateIndex.put(104,"05/04/2020");
		dateIndex.put(105,"05/05/2020");
		dateIndex.put(106,"05/06/2020");
		dateIndex.put(107,"05/07/2020");
		dateIndex.put(108,"05/08/2020");
		dateIndex.put(109,"05/09/2020");
		dateIndex.put(110,"05/10/2020");
		dateIndex.put(111,"05/11/2020");
		dateIndex.put(112,"05/12/2020");
		dateIndex.put(113,"05/13/2020");
		dateIndex.put(114,"05/14/2020");
		dateIndex.put(115,"05/15/2020");
		dateIndex.put(116,"05/16/2020");
		dateIndex.put(117,"05/17/2020");
		dateIndex.put(118,"05/18/2020");
		dateIndex.put(119,"05/19/2020");
		dateIndex.put(120,"05/20/2020");
		dateIndex.put(121,"05/21/2020");
		dateIndex.put(122,"05/22/2020");
		dateIndex.put(123,"05/23/2020");
		dateIndex.put(124,"05/24/2020");
		dateIndex.put(125,"05/25/2020");
		dateIndex.put(126,"05/26/2020");
		dateIndex.put(127,"05/27/2020");
		dateIndex.put(128,"05/28/2020");
		dateIndex.put(129,"05/29/2020");
		dateIndex.put(130,"05/30/2020");
		dateIndex.put(131,"05/31/2020");
		//June
		dateIndex.put(132,"06/01/2020");
		dateIndex.put(133,"06/02/2020");
		dateIndex.put(134,"06/03/2020");
		dateIndex.put(135,"06/04/2020");
		dateIndex.put(136,"06/05/2020");
		dateIndex.put(137,"06/06/2020");
		dateIndex.put(138,"06/07/2020");
		dateIndex.put(139,"06/08/2020");
		dateIndex.put(140,"06/09/2020");
		dateIndex.put(141,"06/10/2020");
		dateIndex.put(142,"06/11/2020");
		dateIndex.put(143,"06/12/2020");
		dateIndex.put(144,"06/13/2020");
		dateIndex.put(145,"06/14/2020");
		dateIndex.put(146,"06/15/2020");
		dateIndex.put(147,"06/16/2020");
		dateIndex.put(148,"06/17/2020");
		dateIndex.put(149,"06/18/2020");
		dateIndex.put(150,"06/19/2020");
		dateIndex.put(151,"06/20/2020");
		dateIndex.put(152,"06/21/2020");
		dateIndex.put(153,"06/22/2020");
		dateIndex.put(154,"06/23/2020");
		dateIndex.put(155,"06/24/2020");
		dateIndex.put(156,"06/25/2020");
		dateIndex.put(157,"06/26/2020");
		dateIndex.put(158,"06/27/2020");
		dateIndex.put(159,"06/28/2020");
		dateIndex.put(160,"06/29/2020");
		dateIndex.put(161,"06/30/2020");
		//July
		dateIndex.put(162,"07/01/2020");
		dateIndex.put(163,"07/02/2020");
		dateIndex.put(164,"07/03/2020");
		dateIndex.put(165,"07/04/2020");
		dateIndex.put(166,"07/05/2020");
		dateIndex.put(167,"07/06/2020");
		dateIndex.put(168,"07/07/2020");
		dateIndex.put(169,"07/08/2020");
		dateIndex.put(170,"07/09/2020");
		dateIndex.put(171,"07/10/2020");
		dateIndex.put(172,"07/11/2020");
		dateIndex.put(173,"07/12/2020");
		dateIndex.put(174,"07/13/2020");
		dateIndex.put(175,"07/14/2020");
		dateIndex.put(176,"07/15/2020");
		dateIndex.put(177,"07/16/2020");
		dateIndex.put(178,"07/17/2020");
		dateIndex.put(179,"07/18/2020");
		dateIndex.put(180,"07/19/2020");
		dateIndex.put(181,"07/20/2020");
		dateIndex.put(182,"07/21/2020");
		dateIndex.put(183,"07/22/2020");
		dateIndex.put(184,"07/23/2020");
		dateIndex.put(185,"07/24/2020");
		dateIndex.put(186,"07/25/2020");
		dateIndex.put(187,"07/26/2020");
		dateIndex.put(188,"07/27/2020");
		dateIndex.put(189,"07/28/2020");
		dateIndex.put(190,"07/29/2020");
		dateIndex.put(191,"07/30/2020");
		dateIndex.put(192,"07/31/2020");
		//August
		dateIndex.put(193,"08/01/2020");
		dateIndex.put(194,"08/02/2020");
		dateIndex.put(195,"08/03/2020");
		dateIndex.put(196,"08/04/2020");
		dateIndex.put(197,"08/05/2020");
		dateIndex.put(198,"08/06/2020");
		dateIndex.put(199,"08/07/2020");
		dateIndex.put(200,"08/08/2020");
		dateIndex.put(201,"08/09/2020");
		dateIndex.put(202,"08/10/2020");
		dateIndex.put(203,"08/11/2020");
		dateIndex.put(204,"08/12/2020");
		dateIndex.put(205,"08/13/2020");
		dateIndex.put(206,"08/14/2020");
		dateIndex.put(207,"08/15/2020");
		dateIndex.put(208,"08/16/2020");
		dateIndex.put(209,"08/17/2020");
		dateIndex.put(210,"08/18/2020");
		dateIndex.put(211,"08/19/2020");
		dateIndex.put(212,"08/20/2020");
		dateIndex.put(213,"08/21/2020");
		dateIndex.put(214,"08/22/2020");
		dateIndex.put(215,"08/23/2020");
		dateIndex.put(216,"08/24/2020");
		dateIndex.put(217,"08/25/2020");
		dateIndex.put(218,"08/26/2020");
		dateIndex.put(219,"08/27/2020");
		dateIndex.put(220,"08/28/2020");
		dateIndex.put(221,"08/29/2020");
		dateIndex.put(222,"08/30/2020");
		dateIndex.put(223,"08/31/2020");
		//September
		dateIndex.put(224,"09/01/2020");
		dateIndex.put(225,"09/02/2020");
		dateIndex.put(226,"09/03/2020");
		dateIndex.put(227,"09/04/2020");
		dateIndex.put(228,"09/05/2020");
		dateIndex.put(229,"09/06/2020");
		dateIndex.put(230,"09/07/2020");
		dateIndex.put(231,"09/08/2020");
		dateIndex.put(232,"09/09/2020");
		dateIndex.put(233,"09/10/2020");
		dateIndex.put(234,"09/11/2020");
		dateIndex.put(235,"09/12/2020");
		dateIndex.put(236,"09/13/2020");
		dateIndex.put(237,"09/14/2020");
		dateIndex.put(238,"09/15/2020");
		dateIndex.put(239,"09/16/2020");
		dateIndex.put(240,"09/17/2020");
		dateIndex.put(241,"09/18/2020");
		dateIndex.put(242,"09/19/2020");
		dateIndex.put(243,"09/20/2020");
		dateIndex.put(244,"09/21/2020");
		dateIndex.put(245,"09/22/2020");
		dateIndex.put(246,"09/23/2020");
		dateIndex.put(247,"09/24/2020");
		dateIndex.put(248,"09/25/2020");
		dateIndex.put(249,"09/26/2020");
		dateIndex.put(250,"09/27/2020");
		dateIndex.put(251,"09/28/2020");
		dateIndex.put(252,"09/29/2020");
		dateIndex.put(253,"09/30/2020");
		//October
		dateIndex.put(254,"10/01/2020");
		dateIndex.put(255,"10/02/2020");
		dateIndex.put(256,"10/03/2020");
		dateIndex.put(257,"10/04/2020");
		dateIndex.put(258,"10/05/2020");
		dateIndex.put(259,"10/06/2020");
		dateIndex.put(260,"10/07/2020");
		dateIndex.put(261,"10/08/2020");
		dateIndex.put(262,"10/09/2020");
		dateIndex.put(263,"10/10/2020");
		dateIndex.put(264,"10/11/2020");
		dateIndex.put(265,"10/12/2020");
		dateIndex.put(266,"10/13/2020");
		dateIndex.put(267,"10/14/2020");
		dateIndex.put(268,"10/15/2020");
		dateIndex.put(269,"10/16/2020");
		dateIndex.put(270,"10/17/2020");
		dateIndex.put(271,"10/18/2020");
		dateIndex.put(272,"10/19/2020");
		dateIndex.put(273,"10/20/2020");
		dateIndex.put(274,"10/21/2020");
		dateIndex.put(275,"10/22/2020");
		dateIndex.put(276,"10/23/2020");
		dateIndex.put(277,"10/24/2020");
		dateIndex.put(278,"10/25/2020");
		dateIndex.put(279,"10/26/2020");
		dateIndex.put(280,"10/27/2020");
		dateIndex.put(281,"10/28/2020");
		dateIndex.put(282,"10/29/2020");
		dateIndex.put(283,"10/30/2020");
		dateIndex.put(284,"10/31/2020");
		//November
		dateIndex.put(285,"11/01/2020");
		dateIndex.put(286,"11/02/2020");
		dateIndex.put(287,"11/03/2020");
		dateIndex.put(288,"11/04/2020");
		dateIndex.put(289,"11/05/2020");
		dateIndex.put(290,"11/06/2020");
		dateIndex.put(291,"11/07/2020");
		dateIndex.put(292,"11/08/2020");
		dateIndex.put(293,"11/09/2020");
		dateIndex.put(294,"11/10/2020");
		dateIndex.put(295,"11/11/2020");
		dateIndex.put(296,"11/12/2020");
		dateIndex.put(297,"11/13/2020");
		dateIndex.put(298,"11/14/2020");
		dateIndex.put(299,"11/15/2020");
		dateIndex.put(300,"11/16/2020");
		dateIndex.put(301,"11/17/2020");
		dateIndex.put(302,"11/18/2020");
		dateIndex.put(303,"11/19/2020");
		dateIndex.put(304,"11/20/2020");
		dateIndex.put(305,"11/21/2020");
		dateIndex.put(306,"11/22/2020");
		dateIndex.put(307,"11/23/2020");
		dateIndex.put(308,"11/24/2020");
		dateIndex.put(309,"11/25/2020");
		dateIndex.put(310,"11/26/2020");
		dateIndex.put(311,"11/27/2020");
		dateIndex.put(312,"11/28/2020");
		
		
		
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
		//System.out.println("North Carolina at March 1st: " + NC.get("3/1/2020"));
	}
	
	
	
	
	
	
	
	
	
	
	private static final long serialVersionUID = 1L;
	
	
	private final JSlider mySlider = new JSlider(1,312,1);
	JPanel sPanel = new JPanel();
	
	//Check out this link: https://stackoverflow.com/questions/18027833/adding-image-to-jframe
	
	@Override
	public void paint(Graphics g)
	{
		int doThisOnce = 0;
		//super.paint(g);
		//bufferedImage
		try
		{
			/*
			Image img = new ImageIcon("C:\\UNC_Fall_2020\\BINF_Advanced_Programming\\Project\\royalty_free_map_of_United_States.jpg").getImage();
			BufferedImage b = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);
			g.drawImage(b, 0, 0, getWidth(), (int)(getHeight()*0.9), this);
			*/
			if (doThisOnce == 0)
			{
				g.drawImage( ImageIO.read(new File("C:\\UNC_Fall_2020\\BINF_Advanced_Programming\\Project\\royalty_free_map_of_United_States.jpg")), 0, 0, getWidth(), (int)(getHeight()*0.9), this);
				doThisOnce++;
			}
			
			
			//g.drawImage( ImageIO.read(new File("C:\\UNC_Fall_2020\\BINF_Advanced_Programming\\Project\\royalty_free_map_of_United_States.jpg")), 0, 0, getWidth(), (int)(getHeight()*0.9), this);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	
		g.setColor(Color.RED);
		g.drawString("AL " + AL.get(dateIndex.get(mySlider.getValue())),535,300);
		g.drawString("AK " + AK.get(dateIndex.get(mySlider.getValue())),135,400);
		g.drawString("AR " + AR.get(dateIndex.get(mySlider.getValue())),440,275);
		g.drawString("AZ " + AZ.get(dateIndex.get(mySlider.getValue())),140,275);
		g.drawString("CA " + CA.get(dateIndex.get(mySlider.getValue())),15,170);
		g.drawString("CO " + CO.get(dateIndex.get(mySlider.getValue())),240,200);
		g.drawString("CT " + CT.get(dateIndex.get(mySlider.getValue())),720,130);
		g.drawString("DE " + DE.get(dateIndex.get(mySlider.getValue())),720,185);
		//g.drawString("DC " + DC.get(dateIndex.get(mySlider.getValue())),135,400);
		g.drawString("FL " + FL.get(dateIndex.get(mySlider.getValue())),700,400);
		g.drawString("GA " + GA.get(dateIndex.get(mySlider.getValue())),595,315);
		g.drawString("HI " + HI.get(dateIndex.get(mySlider.getValue())),285,450);
		g.drawString("ID " + ID.get(dateIndex.get(mySlider.getValue())),130,150);
		g.drawString("IL " + IL.get(dateIndex.get(mySlider.getValue())),475,200);
		g.drawString("IN " + IN.get(dateIndex.get(mySlider.getValue())),530,190);
		g.drawString("IA " + IA.get(dateIndex.get(mySlider.getValue())),410,165);
		g.drawString("KS " + KS.get(dateIndex.get(mySlider.getValue())),330,220);
		g.drawString("KY " + KY.get(dateIndex.get(mySlider.getValue())),530,230);
		g.drawString("LA " + LA.get(dateIndex.get(mySlider.getValue())),460,350);
		g.drawString("ME " + ME.get(dateIndex.get(mySlider.getValue())),720,60);
		g.drawString("MD " + MD.get(dateIndex.get(mySlider.getValue())),720,200);
		g.drawString("MA " + MA.get(dateIndex.get(mySlider.getValue())),720,110);
		g.drawString("MI " + MI.get(dateIndex.get(mySlider.getValue())),550,130);
		g.drawString("MN " + MN.get(dateIndex.get(mySlider.getValue())),410,90);
		g.drawString("MS " + MS.get(dateIndex.get(mySlider.getValue())),480,320);
		g.drawString("MO " + MO.get(dateIndex.get(mySlider.getValue())),440,240);
		g.drawString("MT " + MT.get(dateIndex.get(mySlider.getValue())),220,80);
		g.drawString("NE " + NE.get(dateIndex.get(mySlider.getValue())),330,180);
		g.drawString("NV " + NV.get(dateIndex.get(mySlider.getValue())),75,190);
		g.drawString("NH " + NH.get(dateIndex.get(mySlider.getValue())),720,90);
		g.drawString("NJ " + NJ.get(dateIndex.get(mySlider.getValue())),720,165);
		g.drawString("NM " + NM.get(dateIndex.get(mySlider.getValue())),220,275);
		g.drawString("NY " + NY.get(dateIndex.get(mySlider.getValue())),650,110);
		g.drawString("NC " + NC.get(dateIndex.get(mySlider.getValue())),650,250);
		g.drawString("ND " + ND.get(dateIndex.get(mySlider.getValue())),320,80);
		g.drawString("OH " + OH.get(dateIndex.get(mySlider.getValue())),570,170);
		g.drawString("OK " + OK.get(dateIndex.get(mySlider.getValue())),360,270);
		g.drawString("OR " + OR.get(dateIndex.get(mySlider.getValue())),30,110);
		g.drawString("PA " + PA.get(dateIndex.get(mySlider.getValue())),630,155);
		g.drawString("RI " + RI.get(dateIndex.get(mySlider.getValue())),720,145);
		g.drawString("SC " + SC.get(dateIndex.get(mySlider.getValue())),620,270);
		g.drawString("SD " + SD.get(dateIndex.get(mySlider.getValue())),320,130);
		g.drawString("TN " + TN.get(dateIndex.get(mySlider.getValue())),540,260);
		g.drawString("TX " + TX.get(dateIndex.get(mySlider.getValue())),340,330);
		g.drawString("UT " + UT.get(dateIndex.get(mySlider.getValue())),165,210);
		g.drawString("VT " + VT.get(dateIndex.get(mySlider.getValue())),700,75);
		g.drawString("VA " + VA.get(dateIndex.get(mySlider.getValue())),650,220);
		g.drawString("WA " + WA.get(dateIndex.get(mySlider.getValue())),50,60);
		g.drawString("WV " + WV.get(dateIndex.get(mySlider.getValue())),620,200);
		g.drawString("WI " + WI.get(dateIndex.get(mySlider.getValue())),470,110);
		g.drawString("WY " + WY.get(dateIndex.get(mySlider.getValue())),220,140);
		
		
		sPanel.validate();
	}
	
	/**
	private Image myImage()
	{
		BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
		return image;
	}
	**/
	
	
	private JPanel sliderPanel()
	{
		//JPanel sPanel = new JPanel();
		sPanel.setLayout(new BorderLayout());
		sPanel.add(mySlider, BorderLayout.CENTER);
		return sPanel;
	}
	
	public Covid19Map() 
	{
	getContentPane().setLayout(new BorderLayout());
	
	//add(new JLabel(new ImageIcon("C:\\UNC_Fall_2020\\BINF_Advanced_Programming\\Project\\royalty_free_map_of_United_States.jpg")));
	//JComponent ic = new JComponent("C:\\UNC_Fall_2020\\BINF_Advanced_Programming\\Project\\royalty_free_map_of_United_States.jpg");
	
	//Image myI = Toolkit.getDefaultToolkit().getImage("C:\\UNC_Fall_2020\\BINF_Advanced_Programming\\Project\\royalty_free_map_of_United_States.jpg");
		
		
		
		/**
		this.setContentPane(new JPanel() {
			private static final long serialVersionUID = 1L;
			@Override
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(myI, 0, 0, getWidth(), (int)(getHeight()*0.9), this);
			}
		});
		**/
	
	
	
	
	//getContentPane().add(sliderPanel(), BorderLayout.SOUTH);
	mySlider.addChangeListener(new ChangeListener()
	{

	@Override
	public void stateChanged(ChangeEvent e)
	{
	
		repaint();
		//mySlider.repaint();
	
	}
	});
	
	//mySlider.setVisible(true);
	//mySlider.setLayout(FlowLayout.CENTER);
	getContentPane().add(sliderPanel(), BorderLayout.SOUTH);
	
	//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(800,600);
	setLocation(100,100);
	setResizable(false);
	setVisible(true);
	}


	public static void main(String[] args) throws Exception
	{
		mapMethod("args");
		new Covid19Map();
	}
	
}
