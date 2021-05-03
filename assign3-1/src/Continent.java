public class Continent {
    String continent;
    String capitalCity;
    String country;

    public Continent(String continent,String capitalCity,String country) {


        this.continent=continent;
        this.capitalCity=capitalCity;

        this.country=country;


    }


    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCapitalCity(){return capitalCity;}

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry( String country) {
        this.country= country;
    }
    // write the remaining setters and getters


}
