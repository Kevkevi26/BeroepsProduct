package main_menu;

import java.util.Scanner;

import database_connector.JDBC;

public class Menu {
    public void mainMenu() {
        String[] options = {"1. Login & Play",
                            "2. Register",
                            "3. Leaderboard",
                            "4. Exit"
        };

        Scanner answer = new Scanner(System.in);
        int option;
        for (int i = 0;i < 5;i++) {
            for (String menu : options)
            System.out.println(menu);
            System.out.print("Choose your option: ");
            try {option = answer.nextInt();
                switch (option) {
                    case 1:
                        JDBC conn = new JDBC();
                        conn.printUsers();
                        break;
                    case 2:
                        System.out.println("test 2");
                        break;
                    case 3:
                        System.out.println("test 3");
                        break;
                    case 4:
                        System.out.println("test 4");
                        break;
                }
                
            } catch (Exception e) {
                System.out.println("Pls try again");
            }
        }
    }
}
