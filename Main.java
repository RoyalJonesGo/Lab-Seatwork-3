import adapters.*;
import systems.*;
import target.SchoolManagementApp;

public class Main {
    public static void main(String[] args) {

        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(new AttendanceSystem());
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(new GradingSystem());
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(new LibrarySystem());

        attendanceAdapter.integrateSystem();
        gradingAdapter.integrateSystem();
        libraryAdapter.integrateSystem();
    }
}
