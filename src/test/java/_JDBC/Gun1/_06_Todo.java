package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _06_Todo extends JDBCParent {
    // TODO : city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız
    // TODO : city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız

    @Test
    public void testTodo1() throws SQLException {
        ResultSet rs=sorguEkrani.executeQuery("select city from city");

        rs.last();
        int lenght = rs.getRow();
        rs.first();
        for (int i = 1; i <lenght; i++) {
            rs.absolute(i);
            System.out.println(rs.getString(1));
        }

    }

    @Test
    public void testTodo2() throws SQLException {
        ResultSet rs=sorguEkrani.executeQuery("select city from city");


        while (rs.relative(1)) {
            System.out.println(rs.getString(1));
        }

    }

}
