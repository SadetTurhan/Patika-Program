import core.Db;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        Connection con = Db.getInstance();
    }
}
