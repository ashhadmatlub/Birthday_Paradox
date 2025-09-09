package app;

import java.util.Scanner;

import probability.Probability;

public class App {

    private int people;

    public void run() {

        Scanner sc = new Scanner(System.in);
        Probability prob = new Probability();

        // For Taking input
        do {
            System.out.println("Enter the total number of Persons, must be greater then 23 and less then 1200");
            people = sc.nextInt();
        } while (people < 24 || people > 1200);

        prob.birthdayGenerator(people);
        prob.sameBirthday();
        System.out.println(prob);

        sc.close();
    }
}
