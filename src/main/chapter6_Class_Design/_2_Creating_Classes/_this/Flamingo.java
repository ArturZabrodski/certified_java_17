package main.chapter6_Class_Design._2_Creating_Classes._this;

// this
public class Flamingo {
    private String color = null;

    // 1
    public void setColor(String color) {
        color = color;      // присваивает значение самому себе
//        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static void main(String... unused) {
        var f = new Flamingo();
        f.setColor("PINK");
        System.out.print(f.color);  // выведет null, т.к. в классе нужно присваивать с помощью this
    }
}
