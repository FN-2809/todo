class Eintrag{
    private String uhrzeit;
    private String kontakt;
    private String anlass;

    Eintrag(String uhrzeit, String kontakt, String anlass){
        this.uhrzeit = uhrzeit;
        this.kontakt = kontakt;
        this.anlass = anlass;
    }

    public String getAnlass() {
        return anlass;
    }

    public void setAnlass(String anlass) {
        this.anlass = anlass;
    }

    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }

    public String getUhrzeit() {
        return this.uhrzeit;
    }

    public void setUhrzeit(String uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

    public String getEintrag(){
        return anlass + " mit " + kontakt + " um " + uhrzeit;
    }
}