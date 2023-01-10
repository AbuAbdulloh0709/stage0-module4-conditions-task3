package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month < 1 || month > 12) {
            System.out.println("wrong number!");
            return;
        }
        if ((month) / 3 == 0) {
            System.out.println("Winter");
        } else if ((month) / 3 == 1) {
            System.out.println("Spring");
        } else {
            if ((month) / 3 == 2) {
                System.out.println("Summer");
            } else if ((month) / 3 == 3) {
                System.out.println("Autumn");
            }
        }
    }
}
