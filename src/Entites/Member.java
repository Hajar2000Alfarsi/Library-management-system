package Entites;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Member {
    private UUID id;
    private String CivilID;
    private String name;
    private Address address;
    private List<LibraryItem> borrowItems = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCivilID() {
        return CivilID;
    }

    public void setCivilID(String civilID) {
        CivilID = civilID;
    }

    public List<LibraryItem> getBorrowItems() {
        return borrowItems;
    }

    public void setBorrowItems(List<LibraryItem> borrowItems) {
        this.borrowItems = borrowItems;
    }

    public void addBorrowItem(LibraryItem item) {
        borrowItems.add(item);
    }
}
