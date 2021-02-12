package tools;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;

public class Utils {
	
	public static java.util.Date dateSqlToUtl( java.sql.Date dsql){
		return new java.util.Date(dsql.getTime());
	}
	
	public static java.sql.Date dateUtlToSql( java.util.Date dutl){
		return new java.sql.Date(dutl.getTime());
	}
	
	public static Font loadFont(String name) {
;
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

}
