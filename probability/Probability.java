package probability;

import java.util.ArrayList;
import java.util.List;

public class Probability {
    private List<Integer> birthdays = new ArrayList<>();
    private int total;

    public Probability() {

    }

    // Method to generate Random birthdays
    public void birthdayGenerator(int people) {
        birthdays.clear();
        for (int i = 0; i < people; i++) {
            birthdays.add((int) (Math.random() * 365) + 1);
        }
    }

    // Method for total People
    public int persons() {
        return birthdays.size();
    }

    // Method to check if the 2 persons in a room having the same birhtDay or not
    public int sameBirthday() {

        total = 0;
        for (int i = 0; i < birthdays.size(); i++) {
            for (int j = 0; j < birthdays.size(); j++) {

                if (i != j) {
                    if (birthdays.get(i).equals(birthdays.get(j))) {
                        // System.out.println("Birthday : " + birthday.get(i));
                        total++;
                    }
                }
            }
        }
        return total / 2;
    }

    public boolean hasDuplicate() {
        if (total >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "In a room of " + persons() + " People," +
                "\nIs there any pair or group of people which shares the birthday ? : " + hasDuplicate();
    }
}
