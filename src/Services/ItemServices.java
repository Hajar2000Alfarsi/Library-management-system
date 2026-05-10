package Services;

import Entites.Book;
import Entites.LibraryItem;
import Entites.Magazine;
import Interface.ItemInterface;
import Utils.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class ItemServices implements ItemInterface {
    private List<LibraryItem> items = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Magazine magazine = new Magazine();
    Book book = new Book();
    LibraryItem libraryItem = new LibraryItem();

    @Override
    public void addItem(LibraryItem Item) {

        libraryItem.setId(UUID.randomUUID());

        items.add(Item);


        System.out.println("Item Added Successfully");
    }

    public void addMultipleItems() {
        boolean continueAdding = true;

        while (continueAdding) {
            System.out.println("Chose option: ");
            System.out.println("1- Book");
            System.out.println("2- Magazine");
            System.out.println("3- Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    Book book = new Book();

                    System.out.println(Constants.ENTER_ITEM_NAME);
                    String title = scanner.nextLine();

                    System.out.println(Constants.ENTER_AUTHOR_NAME);
                    String author = scanner.nextLine();

                    book.setName(title);
                    book.setAuthor(author);
                    book.isAvailable();
                    book.setSetItemType("Book");

                    addItem(book);
                }
                case 2 -> {
                    Magazine magazine = new Magazine();

                    System.out.println(Constants.ENTER_ITEM_NAME);
                    String title = scanner.nextLine();

                    System.out.println(Constants.ENTER_ISSUE_NUMBER);
                    int issueNumber = scanner.nextInt();
                    scanner.nextLine();

                    magazine.setName(title);
                    magazine.setIssueNumber(issueNumber);
                    magazine.isAvailable();
                    magazine.setSetItemType("Magazine");
                    magazine.setId(UUID.randomUUID());

                    addItem(magazine);
                }

                case 3 -> continueAdding = false;

                default -> System.out.println("Invalid number");
            }

        }
    }

    public LibraryItem findItemByTitle() {

        System.out.println("Write Item Name: ");
        String title = scanner.nextLine();

        for(LibraryItem item: items) {
            if (item.getName().equalsIgnoreCase(title)) {
                if (item instanceof Book){

                    Book book = (Book) item;
                    System.out.println("Book ID: " + book.getId());
                    System.out.println("Book Name: " + book.getName());
                    System.out.println("Author:" + book.getAuthor());
                    System.out.println("Status: " + book.isAvailable());

                } else if (item instanceof Magazine) {

                    Magazine magazine = (Magazine) item;
                    System.out.println("Magazine ID: " + magazine.getId());
                    System.out.println("Magazine Name: " + magazine.getName());
                    System.out.println("Issue Date:" + magazine.getIssueNumber());
                    System.out.println("Status: " + magazine.isAvailable());

                } else {
                    System.out.println("Item Not Found");
                }
                return item;
            }
        }
        return null;
    }

    public void showAllItems() {

        System.out.println("** List of Items **");

        if (items.isEmpty()) {
            System.out.println("No items available");
            return;
        }

        for (LibraryItem item: items) {
            if (item instanceof Magazine) {
                Magazine magazine = (Magazine) item;
                System.out.println("\nMagazine Details");

                System.out.println("ID: " + magazine.getId());
                System.out.println("Name: " + magazine.getName());
                System.out.println("Issu Date:" + magazine.getIssueNumber());
                System.out.println("Status: " + magazine.isAvailable());
            } else if (item instanceof Book) {
                System.out.println("\nBook Details");
                Book book = (Book) item;
                System.out.println("ID: " + book.getId());
                System.out.println("Name: " + book.getName());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Status: " + book.isAvailable());
            }
        }
    }

    public Boolean handleLibraryMenu(Integer option) {
        switch (option) {
            case 1 -> {
                System.out.println("** Add Items **");
                addMultipleItems();
            }
            case 2 -> {
                findItemByTitle();
            }
            case 3 -> {
                showAllItems();
            }
            case 4 -> {
                System.out.println("Exit");
                return false;
            }
        }
        return true;
    }
}
