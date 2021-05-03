import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsv {
    public ReadCsv(){}
    public List<Continent> readContinentFromCsv(String fileName) {
        List<Continent> continents  = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
           String line=br.readLine();
             if(line!=null) {
                 line = br.readLine();
             }


            while (line != null) {

                String[] arrOfStr = line.split(",");

                Continent continent=createcontinent(arrOfStr);
                continents.add(continent);
                line=br.readLine();


            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return continents;
    }

    public Continent createcontinent(String[] arrOfStr) {
        String continent=arrOfStr[5];
        String capitalCity=arrOfStr[1];
        String country=arrOfStr[0];
        return new Continent(continent,capitalCity,country);
    }


}
