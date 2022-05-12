package JaVa;

import JaVa.Recipe.RecipeCappuccino;
import JaVa.Recipe.RecipeEspresso;
import JaVa.Recipe.RecipeLatte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        MakingCoffee coffee = new MakingCoffee();
        menu(coffee);
    }

    //Вывод необходимой информации в меню пользователя
    public static void menu(MakingCoffee coffee) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("1. Write action (1 - buy, 2 - fill, 3 - take, 4 - remaining, 5 - exit)");
            String menu = bufferedReader.readLine();
            switch (menu){
                case "1":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String menu2 = bufferedReader.readLine();
                    switch (menu2){
                        case "1":
                            RecipeEspresso espresso = new RecipeEspresso();
                            if (espresso.isEnoughIngredients(coffee.availableWater, coffee.availableMilk, coffee.availableCoffeeBeans)){
                                coffee.availableWater-=espresso.mlWater;
                                coffee.availableMilk-=espresso.mlMilk;
                                coffee.availableCoffeeBeans-=espresso.gCoffeeBeans;
                                coffee.availableDisposableCups-= 1;
                                coffee.availableMoney+=espresso.money;
                                System.out.println("I have enough resources, making you a coffee!\n");
                            } else {
                                if (coffee.availableWater <= espresso.mlWater){
                                    System.out.println("Sorry, not enough water!");
                                } else if (coffee.availableMilk <= espresso.mlMilk){
                                    System.out.println("Sorry, not enough milk!");
                                } else {
                                    System.out.println("Sorry, not enough Coffee Beans!");
                                }
                            }
                            break;
                        case "2":
                            RecipeLatte latte = new RecipeLatte();
                            if (latte.isEnoughIngredients(coffee.availableWater, coffee.availableMilk, coffee.availableCoffeeBeans)){
                                coffee.availableWater-=latte.mlWater;
                                coffee.availableMilk-=latte.mlMilk;
                                coffee.availableCoffeeBeans-=latte.gCoffeeBeans;
                                coffee.availableDisposableCups-= 1;
                                coffee.availableMoney+=latte.money;
                                System.out.println("I have enough resources, making you a coffee!\n");
                            } else {
                                if (coffee.availableWater <= latte.mlWater){
                                    System.out.println("Sorry, not enough water!");
                                } else if (coffee.availableMilk <= latte.mlMilk){
                                    System.out.println("Sorry, not enough milk!");
                                } else {
                                    System.out.println("Sorry, not enough Coffee Beans!");
                                }
                            }
                            break;
                        case "3":
                            RecipeCappuccino cappuccino = new RecipeCappuccino();
                            if (cappuccino.isEnoughIngredients(coffee.availableWater, coffee.availableMilk, coffee.availableCoffeeBeans)){
                                coffee.availableWater-=cappuccino.mlWater;
                                coffee.availableMilk-=cappuccino.mlMilk;
                                coffee.availableCoffeeBeans-=cappuccino.gCoffeeBeans;
                                coffee.availableDisposableCups-= 1;
                                coffee.availableMoney+=cappuccino.money;
                                System.out.println("I have enough resources, making you a coffee!\n");
                            } else {
                                if (coffee.availableWater <= cappuccino.mlWater){
                                    System.out.println("Sorry, not enough water!");
                                } else if (coffee.availableMilk <= cappuccino.mlMilk){
                                    System.out.println("Sorry, not enough milk!");
                                } else {
                                    System.out.println("Sorry, not enough Coffee Beans!");
                                }
                            }
                            break;
                        case "back":
                            break;

                    }
                    break;
                case "2":
                    System.out.println("Write how many ml of water you want to add: ");
                    int addWater = Integer.parseInt(bufferedReader.readLine());
                    coffee.addWater(addWater);
                    System.out.println("Write how many ml of milk you want to add:");
                    int addMilk = Integer.parseInt(bufferedReader.readLine());
                    coffee.addMilk(addMilk);
                    System.out.println("Write how many grams of coffee beans you want to add");
                    int addBeans = Integer.parseInt(bufferedReader.readLine());
                    coffee.addCoffeeBeans(addBeans);
                    System.out.println("Write how many disposable cups of coffee you want to add");
                    int addDisposableCups = Integer.parseInt(bufferedReader.readLine());
                    coffee.addDisposableCups(addDisposableCups);
                    break;
                case "3":
                    System.out.println("I gave you $" + coffee.availableMoney + "\n");
                    coffee.availableMoney-=coffee.availableMoney;
                    break;
                case "4":
                    System.out.println("Coffee machine has:\n" +
                            coffee.getAvailableWater() + " ml of water\n" +
                            coffee.getAvailableMilk() + " ml of milk\n" +
                            coffee.getAvailableCoffeeBeans() + " g of coffee beans\n" +
                            coffee.getAvailableDisposableCups() + " disposable cups\n" +
                            "$" + coffee.getAvailableMoney() + " of money\n");
                    break;
                case "5":
                    System.exit(0);
                    break;
            }
        }
    }
}
