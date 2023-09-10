package zoho;

import java.util.Scanner;

public class AddDemo {
	private int sum = 0;

    public void add(int number) {
        sum += number;
        System.out.print(number);
        if (sum != number) {
            System.out.print("+");
        }
        System.out.print("=" + sum + "\n");
    }



    public static void main(String[] args) {
        AddDemo adder = new AddDemo();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            adder.add(number);
        }}}
    
