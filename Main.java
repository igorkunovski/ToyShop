/*Class with main method and process*/

import database.download.ImportCSV;
import database.export.ExportCSV;
import shop.Shop;
import toy.*;

public class Main {
    public static void main(String[] args) {

        Shop toyshop = new Shop();
        Toy barbi = new Doll("Barbi", 20, 5, 5);
        Toy whistle = new Doll("Whistle", 50, 5, 10);
        Toy monopoly = new Game("Monopoly", 4, 15, 5);
        Toy chess = new Game("Chess", 2, 10, 5);
        Toy guitar = new Instrument("Guitar", 3, 5, 2);

        toyshop.addToy(barbi);
        toyshop.addToy(whistle);
        toyshop.addToy(monopoly);
        toyshop.addToy(chess);
        toyshop.addToy(guitar);

        toyshop.showAllToys();

        toyshop.lottery();
        toyshop.lottery();

        new ImportCSV().printLogList(new ImportCSV().log());

        toyshop.lottery();
        toyshop.lottery();

        new ImportCSV().printLogList(new ImportCSV().log());

        new ExportCSV().sendOneGift();
        new ExportCSV().sendOneGift();
        toyshop.lottery();

        new ImportCSV().printLogList(new ImportCSV().log());

//        new ExportCSV().sendAllGifts();
//        new ImportCSV().printLogList(new ImportCSV().log());
    }

}
