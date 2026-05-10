package Entites;

import java.util.UUID;

public class LibraryItem {
    private UUID id;
    private String name;
    private Boolean isAvailable;
    private String setItemType;

    public String getSetItemType() {
        return setItemType;
    }

    public void setSetItemType(String setItemType) {
        this.setItemType = setItemType;
    }

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

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
