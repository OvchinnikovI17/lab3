package allOther;

public class Newspaper implements Describable {

    private String nameNews;
    private String announ = null;


    public Newspaper(String name) {
        this.nameNews = name;
    }

    public boolean announcement(String announ){
        this.announ = announ;
        return true;
    }

    @Override
    public String describe() {
        return  "Газета " + this.nameNews + " гласит: " + this.announ;
    }


}

