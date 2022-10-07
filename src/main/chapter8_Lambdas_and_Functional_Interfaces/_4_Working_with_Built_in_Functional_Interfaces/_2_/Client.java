package main.chapter8_Lambdas_and_Functional_Interfaces._4_Working_with_Built_in_Functional_Interfaces._2_;

public class Client {
    private String name;
    private Integer sum;
    private Boolean isActive;
    public Client(String name, Integer sum, Boolean isActive) {
        this.name = name;
        this.sum = sum;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                ", isActive=" + isActive +
                '}';
    }
}
