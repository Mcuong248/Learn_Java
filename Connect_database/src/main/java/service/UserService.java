package service;

import database.ConnectJDBC;
import model.Gender;
import model.User;
import util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserService {

    public ArrayList<User> getAllUser(Connection conn){
        String query = "SELECT * FROM users";
        ArrayList<User> users = new ArrayList<>();


        try {
            //Tạo truy vấn
            Statement stm = conn.createStatement();

            //Thực thi truy vấn
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("id");
                String username = rs.getString("username");
                Gender gender = Gender.valueOf(rs.getString("gender"));
                String password = rs.getString("password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void addNewUser(Connection conn, String username, Gender gender, String password){
        String id = Util.randomId(5);
        String query = "INSERT INTO users(id, username, gender, password) " +
                "VALUES ('"+id+"', '"+username+"', '"+gender+"', '"+password+"')";

        try {
            Statement stm = conn.createStatement();
            stm.executeQuery(query);
            System.out.println("Thêm thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
