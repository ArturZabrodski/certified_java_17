package main.chapter5_Methods.pond.goose;

import main.chapter5_Methods.pond.duck.DuckTeacher;

public class LostDuckling {
    public void swim() {
        var teacher = new DuckTeacher();
        teacher.swim(); // allowed
        System.out.print("Thanks" + teacher.name); // allowed
    }
}
