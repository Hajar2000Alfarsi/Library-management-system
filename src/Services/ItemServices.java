package Services;

import Entites.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class ItemServices {
    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem Item) {
        items.add(Item);
    }

}
