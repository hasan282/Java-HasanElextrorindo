package hasanelextrorindo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorTwo {
    private static Connection konek;
    public static Connection Connect(String db){
        try{konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db,"root","");}
        catch(SQLException se){System.out.println("koneksi gagal" + se);}
        return konek;
    }
}
