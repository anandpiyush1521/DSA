public class DesignTask extends Task {
    private int designsCompleted;
    private int totalDesigns;

    public DesignTask(String taskName, String description, int totalDesigns) {
        super(taskName, description);
        this.totalDesigns = totalDesigns;
        this.designsCompleted = 0;
    }

    public void completeDesign() {
        this.designsCompleted++;
    }

    @Override
    public void trackProgress() {
        double progress = (double) designsCompleted / totalDesigns * 100;
        System.out.println("Design Task Progress: " + progress + "%");
    }

    // Getters and Setters
    public int getDesignsCompleted() {
        return designsCompleted;
    }

    public void setDesignsCompleted(int designsCompleted) {
        this.designsCompleted = designsCompleted;
    }

    public int getTotalDesigns() {
        return totalDesigns;
    }

    public void setTotalDesigns(int totalDesigns) {
        this.totalDesigns = totalDesigns;
    }
}