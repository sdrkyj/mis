package com.syzc.sseip.pasture.olddata.mdbdumper;

import java.io.IOException;
import java.sql.*;

public class ExtractorMdb {
    public static ResultSet ext() throws IOException, ClassNotFoundException, SQLException {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection conn;
//        conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\TechUser\\Documents\\Tencent Files\\1750863471\\FileRecv\\yingwen.mdb");
        conn = DriverManager.getConnection("jdbc:ucanaccess:///tmp/yingwen.mdb");
        PreparedStatement ps;
        ps = conn.prepareStatement("select * from 查询");
        ResultSet resultSet = ps.executeQuery();

        return resultSet;
    }

    public static void main(String[] args) throws IOException {
    }
}