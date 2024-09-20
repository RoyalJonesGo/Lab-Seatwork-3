package adapters;

import systems.LibrarySystem;
import target.SchoolManagementApp;

public class LibrarySystemAdapter implements SchoolManagementApp {
    private LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;

    }

    @Override
    public void integrateSystem() {
        librarySystem.manageBooks();
    }
}
