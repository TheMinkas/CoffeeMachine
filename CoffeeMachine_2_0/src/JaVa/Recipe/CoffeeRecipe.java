package JaVa.Recipe;

public interface CoffeeRecipe {
    int getMlWater();
    int getMlMilk();
    int getGCoffeeBeans();
    int getMoney();
    boolean isEnoughIngredients(int water, int milk, int coffeeBeans);
}