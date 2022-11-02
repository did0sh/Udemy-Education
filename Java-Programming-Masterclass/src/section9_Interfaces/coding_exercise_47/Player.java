package section9_Interfaces.coding_exercise_47;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
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

    /**
     * Sets new strength.
     *
     * @param strength New value of strength.
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Sets new weapon.
     *
     * @param weapon New value of weapon.
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    /**
     * Gets hitPoints.
     *
     * @return Value of hitPoints.
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * Sets new hitPoints.
     *
     * @param hitPoints New value of hitPoints.
     */
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    /**
     * Gets weapon.
     *
     * @return Value of weapon.
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * Gets strength.
     *
     * @return Value of strength.
     */
    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        return new ArrayList<String>() {{
            add(name);
            add(String.valueOf(hitPoints));
            add(String.valueOf(strength));
            add(weapon);
        }};
    }

    @Override
    public void read(List<String> input) {
        if(input != null && input.size() > 0){
            this.name = input.get(0);
            this.hitPoints = Integer.parseInt(input.get(1));
            this.strength = Integer.parseInt(input.get(2));
            this.weapon = input.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
