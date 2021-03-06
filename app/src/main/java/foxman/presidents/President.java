package foxman.presidents;

import java.io.Serializable;

public class President implements Serializable{
    private int number;
    private String president;
    private int birthYear;
    private int deathYear;
    private String tookOffice;
    private String leftOffice;
    private String party;

    public President(int number, String president, int birthYear, int deathYear, String tookOffice,
                     String leftOffice, String party){
        this.number = number;
        this.president = president;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
        this.tookOffice = tookOffice;
        this.leftOffice = leftOffice;
        this.party = party;
    }

    public int getNumber(){
        return this.number;
    }

    public String getPresident(){
        return this.president;
    }

    public int getBirthYear(){
        return this.birthYear;
    }

    public Integer getDeathYear(){
        return this.deathYear;
    }

    public String getTookOffice(){
        return this.tookOffice;
    }

    public String getLeftOffice(){
        return this.leftOffice;
    }

    public String getParty(){
        return this.party;
    }


}
