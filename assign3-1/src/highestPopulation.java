
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class highestPopulation {

    public void highestPopulation() {
        ReadText p1 = new ReadText();
        List<Country> Countries = p1.readCountriesFromTxt("C:\\Users\\nahla\\IdeaProjects\\tablesaw\\assign3-1\\src\\Countries.txt");
        List<City> Cities = p1.readCitiesFromTxt("C:\\Users\\nahla\\IdeaProjects\\tablesaw\\assign3-1\\src\\Cities.txt");
        Map<String, String> hm7 = new HashMap<>();
        List<String> value1 = new ArrayList<>();
        List<String> value2 = new ArrayList<>();
        for (int x = 0; x < Countries.size(); x++) {
            for (int y = 0; y < Cities.size(); y++) {
                if (Countries.get(x).getCountCode().equals(Cities.get(y).getCode())) {
                    value1.add(Countries.get(x).getCountName());
                    value2.add(Cities.get(y).getName());
                    break;
                }
            }


        }
        for(int h=0;h<value1.size();h++){
            System.out.println(value1.get(h)+" "+":"+" "+value2.get(h));
       }


    }
}





