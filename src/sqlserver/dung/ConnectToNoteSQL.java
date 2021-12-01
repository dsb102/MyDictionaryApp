package sqlserver.dung;


/**
 *
 * @author Dũng Sobin
 */
import dictionary_organization.EntityWord;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.microsoft.sqlserver.jdbc.*;
import dictionary_organization.EntityWord;
import java.sql.*;
import java.util.*;


public class ConnectToNoteSQL {
    private Connection connectDb() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Tạo kết nối đến database
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Note";
            return DriverManager.getConnection(url, "sa", "sa123456");
    }
    public List<EntityWord> findAllWord() {
        List<EntityWord> listWord = new ArrayList<>();
        try {
            // Đăng kí driver loại 4
            Connection conn = connectDb();
            String query = "SELECT * FROM Note";
            // tạo đối tượng statement để thi hành câu truy vấn SQL
            Statement stm = conn.createStatement();
            // gửi câu truy vấn qua db server để thi hành
            // kết quả nhận về 1 đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
            // duyệt ResultSet
            // dùng hàm get...() để đọc từng field của 1 record
            while (rs.next()) {
                String word = rs.getString(1);
                String phonetic = rs.getString(2);
                String means = rs.getString(3);
                EntityWord e = new EntityWord(word, phonetic, means);
                listWord.add(e);
            }
            // đóng kết nối
            rs.close();
            stm.close();
            conn.close();
            
        }catch(ClassNotFoundException e) {
            System.out.println("Driver không đúng");
            e.printStackTrace();
        }catch(SQLException e) {
            e.printStackTrace();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return listWord;
    }
    
    public EntityWord findWords(String words) {
        EntityWord Words = null;
        try {
            // Đăng kí driver loại 4
            Connection conn = connectDb();
            String query = "SELECT * FROM Note WHERE Word=?";
            // tạo đối tượng statement để thi hành câu truy vấn SQL
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(1, words);
            // gửi câu truy vấn qua db server để thi hành
            // kết quả nhận về 1 đối tượng ResultSet
            ResultSet rs = stm.executeQuery();
            // duyệt ResultSet
            // dùng hàm get...() để đọc từng field của 1 record
            while (rs.next()) {
                String word = rs.getString(1);
                String phonetic = rs.getString(2);
                String means = rs.getString(3);
                EntityWord e = new EntityWord(word, phonetic, means);
                return e;
            }
            // đóng kết nối
            rs.close();
            stm.close();
            conn.close();
            
        }catch(ClassNotFoundException e) {
            System.out.println("Driver không đúng");
            e.printStackTrace();
        }catch(SQLException e) {
            e.printStackTrace();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void insertWord(EntityWord ew) {
        EntityWord Words = null;
        try {
            removeWord(ew.getWord());
            // Đăng kí driver loại 4
            Connection conn = connectDb();
            String query = "INSERT INTO Note (Word, Phonetic, Means) VALUES (?,?,?)";
            // tạo đối tượng statement để thi hành câu truy vấn SQL
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(1, ew.getWord());
            stm.setString(2, ew.getPhonetic());
            stm.setString(3, ew.getMeans());
            stm.executeUpdate();
            // đóng kết nối
            stm.close();
            conn.close();
            
        }catch(ClassNotFoundException e) {
            System.out.println("Driver không đúng");
            e.printStackTrace();
        }catch(SQLException e) {
            e.printStackTrace();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void updateWord(EntityWord ew) {
        EntityWord Words = null;
        try {
            // Đăng kí driver loại 4
            Connection conn = connectDb();
            String query = "UPDATE Note SET Word=?, Phonetic=?, Means=? WHERE Word=?";
            // tạo đối tượng statement để thi hành câu truy vấn SQL
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(1, ew.getWord());
            stm.setString(2, ew.getPhonetic());
            stm.setString(3, ew.getMeans());
            stm.setString(4, ew.getWord());
            stm.executeUpdate();
            // đóng kết nối
            stm.close();
            conn.close();
            
        }catch(ClassNotFoundException e) {
            System.out.println("Driver không đúng");
            e.printStackTrace();
        }catch(SQLException e) {
            e.printStackTrace();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void removeWord(String words) {
        try {
            // Đăng kí driver loại 4
            Connection conn = connectDb();
            String query = "DELETE FROM Note WHERE Word=?";
            // tạo đối tượng statement để thi hành câu truy vấn SQL
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(1, words);
            stm.executeUpdate();
            // đóng kết nối
            stm.close();
            conn.close();
            
        }catch(ClassNotFoundException e) {
            System.out.println("Driver không đúng");
            e.printStackTrace();
        }catch(SQLException e) {
            e.printStackTrace();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
