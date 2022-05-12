package JaVa;

public class MakingCoffee {
    int availableWater = 400;
    int availableMilk = 540;
    int availableCoffeeBeans = 120;
    int availableDisposableCups = 9;
    int availableMoney = 550;

    public int getAvailableWater() {
        return availableWater;
    }

    public int getAvailableMilk() {
        return availableMilk;
    }

    public int getAvailableCoffeeBeans() {
        return availableCoffeeBeans;
    }

    public int getAvailableMoney() {
        return availableMoney;
    }

    public int getAvailableDisposableCups() {
        return availableDisposableCups;
    }

    //Метод добавления воды
    public void addWater(int water) {
        this.availableWater += water;
    }

    //Метод добавления молока
    public void addMilk(int milk) {
        this.availableMilk += milk;
    }

    //Метод добавления зерен
    public void addCoffeeBeans(int coffeeBeans) {
        this.availableCoffeeBeans += coffeeBeans;
    }

    //Метод добавления денег
    public void addMoney(int money) {
        this.availableMoney += money;
    }

    //Метод добавления стаканчиков
    public void addDisposableCups (int disposableCups){
        this.availableDisposableCups += disposableCups;
    }
}

