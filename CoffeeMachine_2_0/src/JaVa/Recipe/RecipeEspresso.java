package JaVa.Recipe;

import JaVa.Recipe.CoffeeRecipe;

public class RecipeEspresso implements CoffeeRecipe {
    public final int mlWater;
    public final int mlMilk;
    public final int gCoffeeBeans;
    public final int money;

    public RecipeEspresso() {
        this.mlWater = 250;
        this.mlMilk = 0;
        this.gCoffeeBeans = 16;
        this.money = 4;
    }


    @Override
    public int getMlWater() {
        return mlWater;
    }

    @Override
    public int getMlMilk() {
        return mlMilk;
    }

    @Override
    public int getGCoffeeBeans() {
        return gCoffeeBeans;
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public boolean isEnoughIngredients(int water, int milk, int coffeeBeans) {

        return (water > this.mlWater &&
                milk > this.mlMilk &&
                coffeeBeans > this.gCoffeeBeans);
    }

}