package main.tests.interfaces;

public interface IMethods {

// с фигурными скобками
    default void methodA() {}
    static void methodB() {}
//  void methodС() {} // метод должен быть default или static
//  static methodE(); // не хватает возвращаемого значения и тела {}


// без фигурных скобок только так
    void methodD();
    public void methodE();
    abstract void methodF();
//  public methodG(); // не хватает возвращаемого значения


//    protected methodF(); // не может быть protected
//    private void methodD(); // не может быть private
}
