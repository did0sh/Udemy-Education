package section10_Generics.generics_challenge;


public abstract class Player {
    private String name;


    public Player(String name) {
        this.name = name;
    }


    /**
     * Gets name.
     *
     * @return Value of name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets new name.
     *
     * @param name New value of name.
     */
    public void setName(String name) {
        this.name = name;
    }
}
