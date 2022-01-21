package service;
import model.FilmActor;
import model.Film;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FilmService {

    public Film searchByRating(Connection conn){
        String query = "select * from film,category where film.rating ='PG'";
        Film  film = null;
        try {
            //Tạo truy vấn
            Statement stm = conn.createStatement();

            //Thực thi truy vấn
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                String title = rs.getString("title");
                String description = rs.getString("description");
                int release_year = rs.getInt("release_year");
                int length = rs.getInt("length");
                String rating = rs.getString("rating");
                String category = rs.getString("name");

                film = new Film(title,description,release_year,length,rating,category);
                System.out.println(film);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return film;
    }

    public FilmActor getFilmActor(Connection conn){
        String query = "select title, first_name, last_name from film,actor where film.title LIKE '%ACADEMY%'";
        FilmActor  filmActor = null;
        try {
            //Tạo truy vấn
            Statement stm = conn.createStatement();

            //Thực thi truy vấn
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                String title = rs.getString("title");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");

                filmActor = new FilmActor(title,first_name,last_name);
                System.out.println(filmActor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filmActor;
    }

    public Film searchByTitle(Connection conn,String filmTitle){
        String query = "select * from film,category where film.title LIKE '%"+filmTitle+"%'";
        Film  film = null;
        try {
            //Tạo truy vấn
            Statement stm = conn.createStatement();

            //Thực thi truy vấn
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                String title = rs.getString("title");
                String description = rs.getString("description");
                int release_year = rs.getInt("release_year");
                int length = rs.getInt("length");
                String rating = rs.getString("rating");
                String category = rs.getString("name");

                film = new Film(title,description,release_year,length,rating,category);
                System.out.println(film);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return film;
    }
}
