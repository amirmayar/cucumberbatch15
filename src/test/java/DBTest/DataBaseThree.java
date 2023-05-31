package DBTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataBaseThree {
    public static void main(String[] args) {
        String url = "jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String username = "syntax_hrm";
        String password = "syntaxhrm123";

        try {
            //we need to establish the connection to the database
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection is created for batch 15");
            //create a statement to send sql queries
            Statement statement = conn.createStatement();
            String query = "selct 8 from person;";
            ResultSet rset = statement.executeQuery(query);
            ResultSetMetaData rsmdata = rset.getMetaData();

            List<Map<String, String>> listFromRset = new ArrayList<>();
            // iterate though the rows
            while (rset.next()) {
                Map<String, String> map = new LinkedHashMap<>();
                // iterate over column
                for (int i = 1; i <=rsmdata.getColumnCount();  i++) {
                    // fatching key and value from the columns
                    String key = rsmdata.getColumnName(i);
                    String value = rset.getString(key);
                    map.put(key,value);
                }
                System.out.println(map);
                listFromRset.add(map);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
