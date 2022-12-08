package main.tests.classes._9;

class Data {
    int number;

    Data(int number) {
        this.number = number;
    }
}

public class Test {
    Data data1 = new Data(1);
    Data data2 = new Data(2);

    Data[] getData() {
        return new Data[]{data1, data2};
    }

    public static void main(String[] args) {
        Test test = new Test();

        --test.getData()[1].number;

        Data[] data = test.getData();

        int number1 = (data[0]).number;
        int number2 = (data[1]).number;

        System.out.println(number1 + " " + number2);  // 1 1
    }
}
