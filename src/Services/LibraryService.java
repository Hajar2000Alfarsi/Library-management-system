package Services;

import Entites.Library;

public class LibraryService {
    Library library = new Library();

    public LibraryService() {
        library.setLibraryName("Evergreen Knowledge Library");

        library.setAboutLibrary("Modern library for learning and community");

        library.setLibraryAdress("Al Khoudh, Muscat, Oman");
    }
}
