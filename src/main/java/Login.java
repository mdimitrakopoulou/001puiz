package main.java.quiz_assignment;

import java.util.Scanner;
public class Login {
    private String[] credentials = new String[2];

    public void register() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Please register by entering your credentials:");

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        credentials[0] = username;
        credentials[1] = password;

        System.out.println("Registration successful. You can now log in.");
    }

    public void inputCredentials() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (username.equals(credentials[0]) && password.equals(credentials[1])) {
            System.out.println("Login successful. Welcome, " + username + "!");
        } else {
            System.out.println("Invalid username or password. Login failed.");
        }
    }


}