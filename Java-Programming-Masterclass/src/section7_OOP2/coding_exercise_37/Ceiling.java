package section7_OOP2.coding_exercise_37;

public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    /**
     * Gets height
     *
     * @return value of height
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Gets paintedColor
     *
     * @return value of paintedColor
     */
    public int getPaintedColor() {
        return this.paintedColor;
    }
}
