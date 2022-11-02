package section7_OOP2.coding_exercise_37;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.print("Bed -> Making | ");
    }

    /**
     * Gets style
     *
     * @return value of style
     */
    public String getStyle() {
        return this.style;
    }

    /**
     * Gets pillows
     *
     * @return value of pillows
     */
    public int getPillows() {
        return this.pillows;
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
     * Gets sheets
     *
     * @return value of sheets
     */
    public int getSheets() {
        return this.sheets;
    }

    /**
     * Gets quilt
     *
     * @return value of quilt
     */
    public int getQuilt() {
        return this.quilt;
    }
}
