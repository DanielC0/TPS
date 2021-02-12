
def load_file():
    


    obj_outpt_file= open("AdminDAO.java", "w")

    str_out = "package dao;\n" + \
"\n" + \
"import java.sql.Connection;\n" + \
"import java.sql.DriverManager;\n" + \
"\n" + \
"public class AdminDAO {\n" + \
"	\n" + \
"	private static String url = \"resources/database/InventoryHelperDBs.db\";\n" + \
"	private static Connection connect = null;\n" + \
"	\n" + \
"	/***\n" + \
"	 * this method returns the connection to the database \n" + \
"	 * @return\n" + \
"	 */\n" + \
"	public static Connection getConnection() {\n" + \
"		try {\n" + \
"			if (connect == null) {\n" + \
"				connect.close();\n" + \
"			}\n" + \
"			Class.forName(\"org.sqlite.JDBC\");\n" + \
"			connect = DriverManager.getConnection(\"jdbc:sqlite:\"+url);\n" + \
"			if (connect != null ) {\n" + \
"				System.out.println(\"connection succes\");\n" + \
"			}\n" + \
"		} catch (Exception e) {\n" + \
"			e.printStackTrace();\n" + \
"		}\n" + \
"		\n" + \
"		return connect;\n" + \
"	}\n" + \
"	\n" + \
"	/***\n" + \
"	 * this method closes the connection\n" + \
"	 */\n" + \
"	public static void closeConnection() {\n" + \
"		try {\n" + \
"			connect.close();\n" + \
"			connect = null;\n" + \
"		} catch (Exception e) {\n" + \
"			e.printStackTrace();\n" + \
"		}\n" + \
"	}\n" + \
"	\n" + \
"}\n" + \
"\n" 


    
    obj_outpt_file.write(str_out)
    obj_outpt_file.close()

def main():
    load_file()

if __name__ == '__main__':
    main()
