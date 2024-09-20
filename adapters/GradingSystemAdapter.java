package adapters;

import systems.GradingSystem;
import target.SchoolManagementApp;

public class GradingSystemAdapter implements SchoolManagementApp {
    private GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;

    }

    @Override
    public void integrateSystem() {
        gradingSystem.recordGrades();
    }
}
