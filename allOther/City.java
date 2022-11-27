package allOther;

public class City implements Describable {

    private String cityName;
    private String announce = null;


    public City(String name) {
        this.cityName = name;
    }

    public boolean announcement(String announce){
        this.announce = announce;
        return true;
    }

    public String whereWeAre(){
        return "В городе " + this.cityName;
    }

    @Override
    public String describe() {
        return  "Город " + this.cityName + " гласит: " + this.announce;
    }


}