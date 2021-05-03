import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadText {
    public ReadText(){}
    public List<Country> readCountriesFromTxt(String fileName) {
        List<Country> Countries  = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // read first line


               String line = br.readLine();
                // the first real data


            while (line != null) {
                // System.out.println("the line " + line);
                // use string.split to load a string array with the values from each line of the file, using a comma as the delimiter
                String[] arrOfStr = line.split(", ");
                // adding Pyramid into ArrayList
                Country country=createcountry(arrOfStr);
                Countries.add(country);
                line=br.readLine();
                // read next line before looping
                // if end of file reached, line would be null

            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return Countries;
    }

    public List<City> readCitiesFromTxt(String fileName) {
        List<City> Cities  = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line= br.readLine();



            while (line != null) {
                String[] arrOfStr1 = line.split(", ");

                City city=createcity(arrOfStr1);
                Cities.add(city);
                line=br.readLine();

            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return Cities;
    }

    public City createcity(String[] arrOfStr1) {
        String code = arrOfStr1[3];
        String name =arrOfStr1[1]; //;
        double population=0;
        if(arrOfStr1[2]!=null && arrOfStr1[2].length()>0)
            population= Double.parseDouble(arrOfStr1[2]);


        return new City (code,name,population);

    }

    public Country createcountry(String[] arrOfStr) {
        String countCode = arrOfStr[0];
        String countName =arrOfStr[1];
        double countPopulation=0;
        if(arrOfStr[2]!=null && arrOfStr[2].length()>0)
            countPopulation= Double.parseDouble(arrOfStr[2]);


        return new Country (countCode,countName,countPopulation);

    }



}

