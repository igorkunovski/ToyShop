/*Class works with loading data from file*/

package database.download;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static database.Config.pathCSV;

public class ImportCSV {

    public ArrayList<String> log() {

        ArrayList<String> logList = new ArrayList<>();

        try {
            FileReader file = new FileReader(pathCSV);
            BufferedReader reader = new BufferedReader(file);

            String line;
            while ((line = reader.readLine()) !=null) {
                logList.add(line +"\n");
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return logList;
    }

    public void printLogList(ArrayList<String> logList){
        System.out.print("--> LOG List of pending prizes to be sent---\n");
        for (String line : logList ) {
            System.out.print(line);
        }
        System.out.println("--------LOG END---------------");
    }

}
