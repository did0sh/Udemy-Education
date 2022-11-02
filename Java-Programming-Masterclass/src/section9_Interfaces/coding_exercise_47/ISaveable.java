package section9_Interfaces.coding_exercise_47;

import java.util.List;

public interface ISaveable {
    List<String> write();

    void read(List<String> input);
}
