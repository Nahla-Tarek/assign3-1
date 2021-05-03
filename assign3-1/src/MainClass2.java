

import java.util.*;

public class MainClass2 {

    public static void main(String... args) {
        ReadText p = new ReadText();
        List<Country> Countries = p.readCountriesFromTxt("C:\\Users\\nahla\\IdeaProjects\\tablesaw\\assign3-1\\src\\Countries.txt");
        List<City> Cities = p.readCitiesFromTxt("C:\\Users\\nahla\\IdeaProjects\\tablesaw\\assign3-1\\src\\Cities.txt");
        Map<String, String> hm = new HashMap<>();
        Map<Double, String> hm1 = new HashMap<>();
        List<String> values = new ArrayList<>();
        highestPopulation c=new highestPopulation();

        for (int x = 0; x < Countries.size(); x++) {

            Map<Double, String> sortedMap = new TreeMap<>();
            for (int y = 0; y < Cities.size(); y++) {
                if (Countries.get(x).getCountCode().equals(Cities.get(y).getCode())) {
                    hm1.put(Cities.get(y).getPopulation(), Cities.get(y).getName());
                }
            }
            sortedMap = new TreeMap<>(hm1);
            for (Map.Entry m1 : sortedMap.entrySet()) {
                values.add(String.valueOf(m1.getValue()));
            }
            hm.put(Countries.get(x).getCountCode(), String.valueOf(values));

            values.clear();
            hm1.clear();
            sortedMap.clear();


        }
System.out.println("This is a map that shows cities which each country has are arranged asecending according to population: ");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
System.out.println("highest population city in each country:");
        c.highestPopulation();
System.out.println("highest population capital :");
        HighestPopulationCapital P=new HighestPopulationCapital();
        System.out.println(P.highestPopulationCapital().get(P.highestPopulationCapital().size()-1));

    }
}









            // Adding some key/value


