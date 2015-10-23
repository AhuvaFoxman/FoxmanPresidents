package foxman.presidents;

/**
 * Created by AFoxman on 10/22/2015.
 */
public class Presidents {
    private int number;
    private String president;
    private int birth_year;
    private int death_year;
    private String took_office;
    private String left_office;
    private String party;

    public Presidents(int number,String president,int birth_year,int death_year,String took_office,
                      String left_office, String party){
        this.number = number;
        this.president = president;
        this.birth_year = birth_year;
        this.death_year = death_year;
        this.took_office = took_office;
        this.left_office = left_office;
        this.party = party;
    }

    public int getNumber(){
        return this.number;
    }

    public String getPresident(){
        return this.president;
    }

    public int getBirth_year(){
        return this.birth_year;
    }

    public int getDeath_year(){
        return this.death_year;
    }

    public String getTook_office(){
        return this.took_office;
    }

    public String getLeft_office(){
        return this.left_office;
    }

    public String getParty(){
        return this.party;
    }


}
