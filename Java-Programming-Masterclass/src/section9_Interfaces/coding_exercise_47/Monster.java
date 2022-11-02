package section9_Interfaces.coding_exercise_47;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    /**
     * Gets name
     *
     * @return value of name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets hitPoints
     *
     * @return value of hitPoints
     */
    public int getHitPoints() {
        return this.hitPoints;
    }

    /**
     * Gets strength
     *
     * @return value of strength
     */
    public int getStrength() {
        return this.strength;
    }

    @Override
    public List<String> write() {
        return new ArrayList<String>() {{
            add(name);
            add(String.valueOf(hitPoints));
            add(String.valueOf(strength));
        }};
    }

    @Override
    public void read(List<String> input) {
        if(input != null && input.size() > 0){
            this.name = input.get(0);
            this.hitPoints = Integer.parseInt(input.get(1));
            this.strength = Integer.parseInt(input.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
