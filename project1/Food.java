package project1;

public class Food {
    private String name; // name of the food

    private int calories; // number of calories

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return this.name;
    }

    public int getCalories() {
        return this.calories;
    }
}