package main.chapter1_Building_Blocks;

import java.io.Serializable;

public class Zoo implements Serializable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zoo(String name) {
        this.name = name;
    }
}
