package Entites;

import java.util.UUID;

public class Member {
    private UUID id;
    private String CivilID;
    private String name;
    private Address address;

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
}
