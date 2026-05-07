package Services;

import Entites.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class ItemServices {
    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem Item) {
        items.add(Item);
    }

    public LibraryItem findById(String id){
        for (LibraryItem item: items) {
            if (item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }
}
