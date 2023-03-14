/*Class works with saving data to file*/

package database.export;


import database.download.ImportCSV;
import toy.Toy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static database.Config.pathCSV;

public class ExportCSV {

    public void save(Toy toy) {
        File file = new File(pathCSV);
        try {
            FileWriter fw = new FileWriter(file, true);

            fw.write(toy.getName() + ", Qty left in shop: " + toy.getQty() + "\n");

            System.out.println("-->Winners LOG updated");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void sendOneGift() {

        ArrayList<String> gifts = new ImportCSV().log();

        if (gifts.size() > 0){
            sendAllGifts();
            File file = new File(pathCSV);
            try{
                FileWriter fw = new FileWriter(file, true);

                for (int i=1; i< gifts.size(); i++ ){
                    fw.write(gifts.get(i));
                }

                System.out.println("-->Gift sent, LOG updated");
                fw.flush();
                fw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("List of unsent gifts is Empty");
        }
    }

    public void sendAllGifts() {
        File file = new File(pathCSV);
        try {
            FileWriter fw = new FileWriter(file);

            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
