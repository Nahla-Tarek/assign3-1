public class Country {

    public String countCode;
    public String countName;
    public double countPopulation;
    public Country(String countCode,String countName,double countPopulation){

this.countCode=countCode;
this.countName=countName;
this.countPopulation=countPopulation;
    }
    public String toString() {
        return "country:" + "name=" + countName + ", code=" + countCode  + ", population=" + countPopulation ;
    }

    public String getCountName() {
        return countName;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public String getCountCode(){return countCode;}

    public void setCountCode(String countCode) {
        this.countCode = countCode;}

    public double getCountPopulation() {
        return countPopulation;
    }

    public void setCountPopulation( double countPopulation) {
        this.countPopulation= countPopulation;
    }

}
