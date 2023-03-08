package VARIE.Ristorante_Ancora_Piu_Bello;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static RestaurantService restaurantService = new RestaurantServiceImpl();

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void login() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        try {
            restaurantService.login(username, password);
            System.out.println("Logged in successfully");
            boolean exit = false;
            while (!exit) {
                System.out.println("1. Place order");
                System.out.println("2. View orders");
                System.out.println("3. Logout");
                if (restaurantService.isAdmin()) {
                    System.out.println("4. Manage users");
                }
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        placeOrder();
                        break;
                    case 2:
                        viewOrders();
                        break;
                    case 3:
                        restaurantService.logout();
                        System.out.println("Logged out successfully");
                        exit = true;
                        break;
                    case 4:
                        if (restaurantService.isAdmin()) {
                            manageUsers();
                        } else {
                            System.out.println("Invalid choice");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        } catch (AuthenticationException e) {
            System.out.println("Invalid username or password");
        }
    }

    private static void register() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        try {
            restaurantService.register(username, password, firstName, lastName);
            System.out.println("Registered successfully");
        } catch (RegistrationException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }

    private static void placeOrder() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        try {
            restaurantService.placeOrder(itemName, quantity);
            System.out.println("Order placed successfully");
        } catch (OrderException e) {
            System.out.println("Order failed: " + e.getMessage());
        }
    }

    private static void viewOrders() {
        restaurantService.getOrders().forEach(System.out::println);
    }

    private static void manageUsers() {
        boolean exit = false;
        while (!exit) {
            System.out.println("1. List users");
            System.out.println("2. Delete user");
            System.out.println("3. Update user");
            System.out.println("4. Back");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    listUsers();
                    break;
                case 2:
                    deleteUser();
                    break;
                case 3:
                    updateUser();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void listUsers() {
        restaurantService.getUsers().forEach(System.out::println);
    }

    private static void deleteUser() {
        System.out.print("Enter username to delete: ");
        String username = scanner.nextLine();
        try {
            restaurantService.deleteUser(username);
            System.out.println("User deleted successfully");
        } catch (UserException e) {
            System.out.println("Deletion failed: " + e.getMessage());
        }
    }

    private static void updateUser() {
        System.out.print("Enter username to update: ");
        String username = scanner.nextLine();
        System.out.print("Enter new first name (press Enter to skip): ");
        String firstName = scanner.nextLine();
        System.out.print("Enter new last name (press Enter to skip): ");
        String lastName = scanner.nextLine();
        try {
            restaurantService.updateUser(username, firstName, lastName);
            System.out.println("User updated successfully");
        } catch (UserException e) {
            System.out.println("Update failed: " + e.getMessage());
        }
    }
}
