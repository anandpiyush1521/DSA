public class DevelopmentTask extends Task {
    private int linesOfCodeWritten;
    private int totalLinesOfCode;

    public DevelopmentTask(String taskName, String description, int totalLinesOfCode) {
        super(taskName, description);
        this.totalLinesOfCode = totalLinesOfCode;
        this.linesOfCodeWritten = 0;
    }

    public void writeCode(int lines) {
        this.linesOfCodeWritten += lines;
    }

    @Override
    public void trackProgress() {
        double progress = (double) linesOfCodeWritten / totalLinesOfCode * 100;
        System.out.println("Development Task Progress: " + progress + "%");
    }

    // Getters and Setters
    public int getLinesOfCodeWritten() {
        return linesOfCodeWritten;
    }

    public void setLinesOfCodeWritten(int linesOfCodeWritten) {
        this.linesOfCodeWritten = linesOfCodeWritten;
    }

    public int getTotalLinesOfCode() {
        return totalLinesOfCode;
    }

    public void setTotalLinesOfCode(int totalLinesOfCode) {
        this.totalLinesOfCode = totalLinesOfCode;
    }
}