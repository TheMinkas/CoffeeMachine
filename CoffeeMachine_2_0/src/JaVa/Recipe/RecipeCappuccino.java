package JaVa.Recipe;

public class RecipeCappuccino implements CoffeeRecipe {
    public final int mlWater;
    public final int mlMilk;
    public final int gCoffeeBeans;
    public final int money;

    public RecipeCappuccino() {
        this.mlWater = 200;
        this.mlMilk = 100;
        this.gCoffeeBeans = 12;
        this.money = 6;
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

