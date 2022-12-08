package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.theory;

/**
 * try-finally
 */

// что бы не произошло в try, в finally попадаем всегда
public class ExceptionTest_TF_0 {
    public static void main(String[] args) {
        System.out.println(f()); // например хотим вернуть данные из файла
    }

    public static int f() {
        try {
            System.out.println(0);
            throw new RuntimeException(); // throw заменяет return
        } finally {  // finally не поглощает исключение
            System.out.println(1);
        }
// 0
// 1
// RuntimeException...
    }
}

class ExceptionTest_TF_1 {
    public static void main(String[] args) {
        System.out.println(f());
    }

    public static int f() {
        try {
            System.out.println(0);
            return 42;
        } finally { // finally перехватывает даже return
            System.out.println(1);
        }
// 0
// 1
// 42
    }
}

class ExceptionTest_TF_2 {
    public static void main(String[] args) {
        System.out.println(f());
    }

    public static int f() {
        try {
            System.out.println(0);
            return 42;
        } finally {
            System.out.println(1);
            return 24; // перебивает return try
        }
// 0
// 1
// 24
    }
}

class ExceptionTest_TF_3 {
    public static void main(String[] args) {
        System.out.println(f());
    }

    public static int f() {
        try {
            System.out.println(0);
            throw new RuntimeException();
        } finally {
            System.out.println(1);
            return 24; // это плохая практика, т.к.  перебивает исключение
        }
// 0
// 1
// 24
    }
}

class ExceptionTest_TF_4 {
    public static void main(String[] args) {
        System.out.println(f());
    }

    public static int f() {
        try {
            System.out.println(0);
            return 42;
        } finally {
            System.out.println(1);
            throw new RuntimeException();
        }
// 0
// 1
// RuntimeException...
    }
}

class ExceptionTest_TF_5 {
    public static void main(String[] args) {
        System.out.println(f());
    }

    public static int f() {
        try {
            System.out.println(0);
            throw new RuntimeException();
        } finally {
            System.out.println(1);
            throw new NullPointerException();
        }
// 0
// 1
// NullPointerException...
    }
}