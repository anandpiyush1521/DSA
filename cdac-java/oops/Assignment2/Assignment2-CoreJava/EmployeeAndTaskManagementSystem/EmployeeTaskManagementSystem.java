public class EmployeeTaskManagementSystem {
    public static void main(String[] args) {
        Task devTask = new DevelopmentTask("Implement Feature X", "Develop the new feature X", 1000);
        Task designTask = new DesignTask("Design UI for Feature Y", "Create the UI design for feature Y", 10);

        ((DevelopmentTask) devTask).writeCode(500);
        ((DevelopmentTask) devTask).writeCode(300);
        ((DesignTask) designTask).completeDesign();
        ((DesignTask) designTask).completeDesign();
        ((DesignTask) designTask).completeDesign();

        // Track progress
        devTask.trackProgress(); // Output: Development Task Progress: 80.0%
        designTask.trackProgress(); // Output: Design Task Progress: 30.0%
    }
}