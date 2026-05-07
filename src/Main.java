import Menu.Menu;
import Services.ItemServices;
import Services.LibraryService;
import Utils.Constants;
import Utils.MenuMessages;

import java.util.Scanner;

public class Main {
    static Menu menu = new Menu();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryService libraryService = new LibraryService();

        ItemServices itemServices = new ItemServices();

        Boolean mainMenuContinue = true;
        while (mainMenuContinue) {
            System.out.println("\n *********** Library Management System ***********");
            menu.displayMenu();

            Integer option = scanner.nextInt();

            switch (option) {

                case 1 -> {
                    Boolean LibraryMenuContinue = true;

                    while (LibraryMenuContinue) {
                        System.out.println("\n *********** Library Menu ***********");
                        System.out.println(MenuMessages.LIBRARY_MENU_MESSAGE);
                        System.out.println(Constants.ENTER_OPTION);

                        LibraryMenuContinue = libraryService.handleLibraryMenu(scanner.nextInt());
                    }
                }

               /* case 2 -> {
                    Boolean MemberExit = true;

                    while (MemberExit) {
                        System.out.println(MenuMessage.MemberMenu);
                        System.out.println(Constants.ENTER_OPTION);

                        MemberExit = memberService.handleMemberMenu(scanner.nextInt());
                    }
                }

                case 3 -> {
                    Boolean borrowExit = true;

                    while (borrowExit) {
                        System.out.println(MenuMessage.BorrowMenu);
                        System.out.println(Constants.ENTER_OPTION);

                        borrowExit = borrowService.handleBorrowMenu(scanner.nextInt());
                    }
                }*/

                case 4 -> {
                    System.out.println("Exit...");
                    mainMenuContinue = false;
                }

                default -> System.out.println("Invalid option");
            }
        }
    }
}