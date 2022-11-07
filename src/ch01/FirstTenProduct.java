package ch01;

public class FirstTenProduct {

    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <= 10; i++) product *= i;
        System.out.println(product);
    }
}
