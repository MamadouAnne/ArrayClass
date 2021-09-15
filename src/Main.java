import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(20);
        numbers.insert(40);
        numbers.insert(20);
        int[] common = numbers.intersect();
        System.out.println(common.toString());
        //System.out.println("max number: " + numbers.max(10));
        //numbers.removeAt(2);
        //System.out.println(numbers.indexOf(20));
        numbers.print();
    }
}
