package Services;

import Entites.Library;

public class LibraryService {
    Library library = new Library();

    public LibraryService() {
        library.setLibraryName("Evergreen Knowledge Library");

        library.setAboutLibrary("Modern library for learning and community");

        library.setLibraryAdress("Al Khoudh, Muscat, Oman");
    }

    public void showLibraryInfo() {
        System.out.println("Name: " + library.getLibraryName());
        System.out.println("About: " + library.getAboutLibrary());
        System.out.println("Address: " + library.getLibraryAdress());
    }
}
