package anhtester.com.javabasic.variables;

public class LearnVariables {
    static int age = 26; // biến toàn cục
    static int number = 20;

    public static void sayHello() {
        int n = 10;      // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
        System.out.println(number);
    }

    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(number);

        // Cách 1:
        LearnVariables abc = new LearnVariables();
        abc.sayHello();
        // Cách 2:
        sayHello();
    }
}
