import Menu.Menu;
import Services.BorrowService;
import Services.ItemServices;
import Services.LibraryService;
import Services.MemberService;
import Utils.Constants;
import Utils.MenuMessages;

import java.util.Scanner;

public class Main {
    static Menu menu = new Menu();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryService libraryService = new LibraryService();
        MemberService memberService = new MemberService();
        BorrowService borrowService = new BorrowService();

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

               case 2 -> {
                    Boolean ItemMenuContinue = true;

                    while (ItemMenuContinue) {
                        System.out.println("\n *********** Item Menu ***********");
                        System.out.println(MenuMessages.ITEM_SERVICE_MENU_MESSAGE);
                        System.out.println(Constants.ENTER_OPTION);

                        ItemMenuContinue = itemServices.handleLibraryMenu(scanner.nextInt());
                    }
                }

                case 3 -> {
                    Boolean MemberMenuContinue = true;

                    while (MemberMenuContinue) {
                        System.out.println("\n *********** Member Menu ***********");
                        System.out.println(MenuMessages.MEMBER_SERVICE_MENU_MESSAGE);
                        System.out.println(Constants.ENTER_OPTION);

                        MemberMenuContinue = memberService.handleMemberMenu(scanner.nextInt());
                    }
                }

                case 4 -> {
                    Boolean BorrowMenuContinue = true;

                    while (BorrowMenuContinue) {
                        System.out.println("\n *********** Member Menu ***********");
                        System.out.println(MenuMessages.BORROW_SERVICE_MENU_MESSAGE);
                        System.out.println(Constants.ENTER_OPTION);

                        BorrowMenuContinue = borrowService.handleBorrowedMenu(scanner.nextInt());
                    }
                }
                case 5 -> {
                    System.out.println("Exit...");
                    mainMenuContinue = false;
                }

                default -> System.out.println("Invalid option");
            }
        }
    }
}