package tools;


public class Utils {
	
	public static java.util.Date dateSqlToUtl( java.sql.Date dsql){
		return new java.util.Date(dsql.getTime());
	}
	
	public static java.sql.Date dateUtlToSql( java.util.Date dutl){
		return new java.sql.Date(dutl.getTime());
	}

}
