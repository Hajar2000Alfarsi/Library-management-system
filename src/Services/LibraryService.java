package Services;

import Entites.Library;
import Utils.Constants;

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

    public Boolean handleLibraryMenu(Integer option) {
        switch (option) {
            case 1 -> {
                System.out.println(Constants.LIBRARY_NAME + library.getLibraryName());
            }
            case 2 -> {
                System.out.println(Constants.ABOUT_LIBRARY + library.getAboutLibrary());
            }
            case 3 -> {
                System.out.println(Constants.LIBRARY_ADDRESS + library.getLibraryAdress());
            }
            case 4 -> {
                showLibraryInfo();
            }
            case 5 ->{
                return false;
            }
        }
        return true;
    }
}
