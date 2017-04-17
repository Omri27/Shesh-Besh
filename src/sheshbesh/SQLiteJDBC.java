package sheshbesh;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.*;
import java.util.*;

public class SQLiteJDBC {
    private static Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:DataBase.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static boolean userExists(String userName) {
        String sql = "SELECT userName FROM User WHERE `username`=?";

        try (Connection conn = connect()){

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,userName);
            ResultSet rs    = pstmt.executeQuery();

            // loop through the result set
            if (rs.next()) {
                return true;

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;

    }

    public static int signUp(String userName, String password) {
        Connection c = null;
        Statement stmt = null;
        String hash = "";

        if(userExists(userName)){
            return 2;
        }

        try {
            hash = Encrypt.generateHash(password);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }

        String sql = "INSERT INTO User(username,password) VALUES(?,?)";

        try(Connection conn = connect()){

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,userName);
            pstmt.setString(2,hash);
            pstmt.executeUpdate();


        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }

        return 0;
    }
    public static boolean login(String userName, String password) {



        String sql = "SELECT * FROM User WHERE `username`=?";
       // String sql = "SELECT userName, password FROM User WHERE `username`=? AND `password`=?";

        try (Connection conn = connect()){

             PreparedStatement pstmt = conn.prepareStatement(sql);
             pstmt.setString(1,userName);
             //pstmt.setString(2,password);
             ResultSet rs    = pstmt.executeQuery();

            // loop through the result set
            if (rs.next()) {
                String hash = rs.getString("password");
                if(Encrypt.validatePassword(password,hash))
                    return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static int getUserScore(String userName) {



        String sql = "SELECT * FROM User WHERE `username`=?";
        // String sql = "SELECT userName, password FROM User WHERE `username`=? AND `password`=?";
        int score = 0;
        try (Connection conn = connect()){

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,userName);
            //pstmt.setString(2,password);
            ResultSet rs    = pstmt.executeQuery();

            // loop through the result set
            if (rs.next()) {
                 score = rs.getInt("score");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return score;
    }
    public static void updateScore(String userName){

        String sql = "UPDATE User SET score = score + 1 WHERE `username` = ?";

        try (Connection conn = connect()){

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,userName);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Map.Entry<String,Integer>> getLeaderBoards(){
        String sql = "SELECT username,score FROM User";
        HashMap<String,Integer>leaderBoards = new HashMap<>();

        ArrayList<Map.Entry<String,Integer>> arr = null;

        try (Connection conn = connect()){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                leaderBoards.put(rs.getString("username"),rs.getInt("score"));
            }
            arr = new ArrayList<>(leaderBoards.entrySet());
            Collections.sort(arr, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue() - o1.getValue();
                }
            });

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return arr;

    }
    public static void deleteUser(String userName){

        String sql = "DELETE FROM User WHERE `username` = ?";

        try (Connection conn = connect()){

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,userName);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}