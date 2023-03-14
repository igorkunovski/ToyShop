/*Clas is used as List for Toys with required methods*/

package shop;

import database.export.ExportCSV;
import execption.InventoryException;
import toy.Toy;
import java.util.*;

public class Shop {

    private final Map<String, Toy> toys;

    public Shop() {
        this.toys = new HashMap<>();
    }

    public Map<String, Toy> getToys() {
        return toys;
    }

    public void addToy(Toy toy){
        this.toys.put(toy.getName(), toy);
    }

    public void lotteryResult(Toy toy){
        toy.setQty(toy.getQty() - 1);
    }

    public void showAllToys(){
        System.out.println("-->Toys at the the moment in the shop:");
        for (Toy toy: this.toys.values()) {
            System.out.println(toy);
        }
        System.out.println("----------List END-----------");
    }

    public void lottery(){

        if(checkPossibility()) {
            System.out.println("***LOTTERY IN PROCESS***");
            processLottery();
        }else {
            try {
                throw new InventoryException();
            }catch (InventoryException ignored){
            }
        }
    }

    private void processLottery() {
        Random rnd = new Random();
        String key;

        int num = rnd.nextInt(0, 200);
        if (num <= 10){
            System.out.println("You won: Guitar");
            key = "Guitar";

        } else if (num <= 30) {
            System.out.println("You won: Chess");
            key = "Chess";

        }else if (num <= 60) {
            System.out.println("You won: Monopoly");
            key = "Monopoly";

        } else if (num <= 100) {
            System.out.println("You won: Barbi");
            key = "Barbi";

        } else {
            System.out.println("You won: Whistle");
            key = "Whistle";
        }
        lotteryResult(this.toys.get(key));
        new ExportCSV().save(this.toys.get(key));
    }

    private boolean checkPossibility() {
        for (Toy toy: this.toys.values()) {
            if (toy.getQty() == 0){
                return false;
            }
        }
        return true;
    }
}
