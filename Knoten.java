public class Knoten {
    private Eintrag inhalt;
    private Knoten naechster;

    Knoten(Eintrag inhalt){
        this.inhalt = inhalt;
    }

    public Eintrag getInhalt(){
        return this.inhalt;
    }

    public void setInhalt(Eintrag inhalt){
        this.inhalt = inhalt;
    }

    public Knoten getNaechster(){
        return this.naechster;
    }

    public void setNaechster(Knoten naechster){
        this.naechster = naechster;
    }
}
