package tools;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;

public class Utils {
	
	/***
	 * Convert the Sql Date to Util Date
	 * @param dsql
	 * @return
	 */
	public static java.util.Date dateSqlToUtl( java.sql.Date dsql){
		return new java.util.Date(dsql.getTime());
	}
	
	/***
	 * convert the util Dte to Sql Date
	 * @param dutl
	 * @return
	 */
	public static java.sql.Date dateUtlToSql( java.util.Date dutl){
		return new java.sql.Date(dutl.getTime());
	}
	
	/***
	 * Load some font
	 * @param name
	 * @return
	 */
	public static Font loadFont(String name) {
		try{
			String url = "resources/font/"+name;
			Font newF = Font.createFont(Font.TRUETYPE_FONT, new File(url));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(url)));
			return newF;
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	
	/***
	 * Return if the art String is in the correct form 
	 * atr.length() >= lm 
	 *  
	 * @param atr
	 * @param lm
	 * @return
	 */
	public static boolean noempryString(String atr, int lm) {
		String rest="";
		for (int i = 0; i < atr.length(); i++) {
			if (!(atr.substring(i,i+1).equals(" ") || atr.substring(i,i+1).equals("\t") )) {
				rest += atr.substring(i,i+1);
			}
		}
		return (rest.length() >= lm);
	}

}
