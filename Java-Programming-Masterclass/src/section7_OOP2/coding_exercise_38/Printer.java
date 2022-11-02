package section7_OOP2.coding_exercise_38;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100){
            if (this.tonerLevel + tonerAmount > 100){
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
            }
        } else {
            return -1;
        }
        return this.tonerLevel;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint = pagesToPrint / 2 + pagesToPrint % 2;
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    /**
     * Gets pagesPrinted
     *
     * @return value of pagesPrinted
     */
    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
