package SirenkoAlexandr_2kurs_10gruppa;

public class Cheese extends Food {
    public Cheese() {
        super("Сыр");
    }

    public void consume() {
        System.out.println(this + " съеден");
    }

    @Override
    public int calculateCalories() {
        return 371;
    }
}
