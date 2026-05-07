package Interface;

import Entites.LibraryItem;

public interface ItemInterface {
    void addItem(LibraryItem Item);
    LibraryItem  findById(String id);

}
