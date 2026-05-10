package Services;

import Entites.Member;
import Interface.BorrowInterface;
import Entites.LibraryItem;

import java.util.Scanner;

public class BorrowService implements BorrowInterface {

    ItemServices itemServices = new ItemServices();
    MemberService memberService = new MemberService();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void borrowItem() {
        itemServices.showAllItems();

        LibraryItem item = itemServices.findItemByTitle();

        if (item == null) {
            return;
        }

        if (!item.getAvailable()) {
            System.out.println("Item Borrowed");
            return;
        }

        Member member = memberService.findMemberByCivilId();

        if (member == null) {
            return;
        }

        member.addBorrowItem(item);
        item.setAvailable(false);

        System.out.println("Item Borrowed Successfully");
    }

    @Override
    public void returnItem(){
        Member member = memberService.findMemberByCivilId();

        if (member == null) {
            return;
        }

        System.out.println("Enter Item name: ");

        String title = scanner.nextLine();

        LibraryItem foundItem = null;

        for (LibraryItem item: member.getBorrowItems()) {
            if (item.getName().equalsIgnoreCase(title)) {
                foundItem = item;
                break;
            }
        }

        if (foundItem == null) {
            System.out.println("Item Not found");
            return;
        }

        member.getBorrowItems().remove(foundItem);
        foundItem.setAvailable(true);

        System.out.println("Item returned Successfully");
    }

    public Boolean handleBorrowedMenu(Integer option) {
        switch (option) {
            case 1 -> borrowItem();
            case 2 -> returnItem();
            case 3 -> {
                System.out.println("Exit");
                return false;
            }
            default -> System.out.println("Invalid number");
        }
        return true;
    }
}
