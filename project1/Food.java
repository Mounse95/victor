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

    public String getCalories() {
        return this.calories;
    }

}
//
//
// public class Meat extends Food {
//     this.name; // ok
// }
//

// FoodList
Food f = new Food("poulet", 42);
f.name; // error
