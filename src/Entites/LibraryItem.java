package Entites;

import java.util.UUID;

public class LibraryItem {
    private UUID id;
    private String name;
    private boolean isAvailable = true;
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

    public boolean isAvailable() {
        return true;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
