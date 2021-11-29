/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlserver.dung;
//import com.microsoft.sqlserver.jdbc.*;
import dictionary_organization.EntityWord;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Dũng Sobin
 */
public class ConnectToSQL {
    private Connection connectDb() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Tạo kết nối đến database
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Dictionary";
            return DriverManager.getConnection(url, "sa", "sa123456");
    }
    public List<EntityWord> findAllWordLike(String words) {
        List<EntityWord> listWord = new ArrayList<>();
        try {
            // Đăng kí driver loại 4
            Connection conn = connectDb();
            String query = "SELECT * FROM Dic WHERE Word LIKE '" + words + "%'";
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
                if (listWord.size() >= 100) break; // giới hạn từ gợi ý
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
    
    public boolean checkContain(String wordCheck) {
        List<String> listWord = new ArrayList<>();
        try {
            // Đăng kí driver loại 4
            Connection conn = connectDb();
            String query = "SELECT * FROM Dic WHERE Word like '" + wordCheck + "'";
            // tạo đối tượng statement để thi hành câu truy vấn SQL
            Statement stm = conn.createStatement();
            // gửi câu truy vấn qua db server để thi hành
            // kết quả nhận về 1 đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
            // duyệt ResultSet
            // dùng hàm get...() để đọc từng field của 1 record
            String word = "";
            while (rs.next()) {
                word = rs.getString(1);
                break;
            }
            // đóng kết nối
            rs.close();
            stm.close();
            conn.close();
            return word.equalsIgnoreCase(wordCheck);
            
            
            
        }catch(ClassNotFoundException e) {
            System.out.println("Driver không đúng");
            e.printStackTrace();
        }catch(SQLException e) {
            e.printStackTrace();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public List<String> findAllWord() {
        List<String> listWord = new ArrayList<>();
        try {
            // Đăng kí driver loại 4
            Connection conn = connectDb();
            String query = "SELECT * FROM Dic";
            // tạo đối tượng statement để thi hành câu truy vấn SQL
            Statement stm = conn.createStatement();
            // gửi câu truy vấn qua db server để thi hành
            // kết quả nhận về 1 đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
            // duyệt ResultSet
            // dùng hàm get...() để đọc từng field của 1 record
            while (rs.next()) {
                String word = rs.getString(1);
                listWord.add(word);
//                if (listWord.size() >= 300) break; // giới hạn từ gợi ý
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
    
    public List<String> findAllWordSuggestion(String words) {
        List<String> listWord = new ArrayList<>();
        try {
            // Đăng kí driver loại 4
            Connection conn = connectDb();
            String query = "SELECT * FROM Dic WHERE Word LIKE '" + words + "%'";
            // tạo đối tượng statement để thi hành câu truy vấn SQL
            Statement stm = conn.createStatement();
            // gửi câu truy vấn qua db server để thi hành
            // kết quả nhận về 1 đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
            // duyệt ResultSet
            // dùng hàm get...() để đọc từng field của 1 record
            int cnt = 0;
            while (rs.next()) {
                String word = rs.getString(1);
                listWord.add(word);
                if (cnt++ > 50) break;
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
            String query = "SELECT * FROM Dic WHERE Word=?";
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
            String query = "INSERT INTO Dic (Word, Phonetic, Means) VALUES (?,?,?)";
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
            String query = "UPDATE Dic SET Word=?, Phonetic=?, Means=? WHERE Word=?";
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
        EntityWord Words = null;
        try {
            // Đăng kí driver loại 4
            Connection conn = connectDb();
            String query = "DELETE FROM Dic WHERE Word=?";
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
    
    
//    public static void main(String[] args) throws SQLException {
//        ConnectToSQL con = new ConnectToSQL();
//        List<EntityWord> li = con.findAllWordLike("dull");
//        for (EntityWord entityWord : li) {
//            System.out.println(entityWord);
//        }
//        EntityWord ew = con.findWords("flag");
//        System.out.println(ew);
//        EntityWord ew = new EntityWord("TestInsertWord", "/Khongdoc/", "Có nghĩa gi đấy");
//        con.insertWord(ew);
        
//        System.out.println(ew);
//          con.removeWord("TestInsertWord");
//        con.updateWord(ew);
//        con.removeWord("TestInsertWord");
//    }
}
