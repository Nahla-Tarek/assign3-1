

public class City {


    String code;
    String name;
    double population;

    public City(String code, String name,  double population) {


        this.code=code;
        this.name=name;

        this.population=population;


    }

    @Override
    public String toString() {
        return "city:" + "name=" + name + ", code=" + code  + ", population=" + population ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode(){return code;}

    public void setCode(String code) {
        this.code = code;
    }


    public double getPopulation() {
        return population;
    }

    public void setPopulation( double population) {
        this.population= population;
    }
    // write the remaining setters and getters


}
