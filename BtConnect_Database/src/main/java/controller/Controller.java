package controller;

import database.ConnectJDBC;
import service.FilmService;
import java.sql.Connection;
import java.util.Scanner;

public class Controller {
    FilmService service;
    ConnectJDBC connectJDBC;
    Connection conn;
    Scanner sc;

    public Controller() {
        service = new FilmService();
        connectJDBC = new ConnectJDBC();
        conn = connectJDBC.connect();
        sc = new Scanner(System.in);
    }

    public void mainMenu() {
        boolean isCheck = false;
        while (!isCheck) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    service.searchByRating(conn);
                    break;
                case 2:
                    service.getFilmActor(conn);
                    break;
                case 3:
                    getFilmByTitle();
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void menu() {
        System.out.println("Lựa chọn của bạn là: ");
        System.out.println("1 - Lấy ra thông tin các phim gồm: title, description, release_year, length, rating, category của các phim có rating là PG");
        System.out.println("2 - Lấy ra title, first_name và last_name actor của các bộ phim có chứa từ ACADEMY");
        System.out.println("3 - Tìm phim theo title, với title nhập từ bàn phím");
    }

    public void getFilmByTitle(){
        System.out.println("Title: ");
        String title = sc.nextLine();
        service.searchByTitle(conn,title);
    }
}