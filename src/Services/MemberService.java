package Services;

import Entites.Address;
import Entites.Member;
import Utils.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class MemberService {

    static List<Member> memberList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Member member = new Member();
    Address address = new Address();

    public void registerMember(Member member) {
        for (Member m: memberList) {
            if (m.getId().equals(member.getId())){
                System.out.println(Constants.FAILED_ADD_MEMEBER);
                return;
            }
        }
        memberList.add(member);
        System.out.println(Constants.SUCCESS_ADD_MEMEBER);
    }

    public void AddMultipleMembers() {
        Boolean continueAdding = true;

        while (continueAdding) {
            Member member = new Member();
            Address address = new Address();

            System.out.println("Enter Member Name: ");
            member.setName(scanner.nextLine());

            System.out.println("Enter Civil ID: ");
            member.setCivilID(scanner.nextLine());

            member.setId(UUID.randomUUID());

            System.out.println("Enter City: ");
            address.setCity(scanner.nextLine());

            System.out.println("Enter Street name: ");
            address.setStreet(scanner.nextLine());

            System.out.println("Enter Postel code: ");
            address.setPostalCode(scanner.nextLine());

            member.setAddress(address);

            registerMember(member);

            System.out.println("Enter q to exit or enter to add more member ");
            if (scanner.nextLine().equalsIgnoreCase("q")){
                continueAdding = false;
            }
        }
    }

    public void displayAllMembers() {
        System.out.println("*** List of Members ***");

        for (Member m: memberList) {
            System.out.println("Member ID: " + m.getId());
            System.out.println("Member Civil ID: " + m.getCivilID());
            System.out.println("Member Name: " + m.getName());

            System.out.println("Member Address");

            System.out.println("City: " + m.getAddress().getCity());
            System.out.println("Street: " + m.getAddress().getStreet());
            System.out.println("Postel code: " + m.getAddress().getPostalCode());

        }
    }

    public Member findMemberByCivilId(){
        System.out.println("Enter Civil ID: ");
        String civilId = scanner.nextLine();

        Member foundMember = null;

        for (Member m: memberList) {
            if (m.getCivilID().equals(civilId)) {
                foundMember = m;

                System.out.println("Member ID: " + m.getId());
                System.out.println("Member Civil ID: " + m.getCivilID());
                System.out.println("Member Name: " + m.getName());

                System.out.println("Member Address");

                System.out.println("City: " + m.getAddress().getCity());
                System.out.println("Street: " + m.getAddress().getStreet());
                System.out.println("Postel code: " + m.getAddress().getPostalCode());

            }
        }
        System.out.println("Member not found");
        return foundMember;
    }

    public Boolean handleMemberMenu(Integer option) {
        switch (option){
            case 1 -> AddMultipleMembers();
            case 2 -> findMemberByCivilId();
            case 3 -> displayAllMembers();
            case 4 -> {
                System.out.println("Exit");
                return false;
            }
            default -> System.out.println("Invalid number");
        }
        return true;
    }
}
