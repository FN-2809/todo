class VerketteteListe{
    private Knoten erster = null;
    private Knoten letzter = null;

    VerketteteListe(){
    }

    public void setErster(Knoten erster) {
        this.erster = erster;
    }

    public void setLetzter(Knoten letzter) {
        this.letzter = letzter;
    }

    public Knoten getErster(){
        return this.erster;
    }

    public Knoten getLetzter(){
        return this.letzter;
    }

    public boolean istLeer(){
        return (erster == null);
    }

    public void anhaengen(Eintrag eintrag){
        if(erster == null){
            erster = new Knoten(eintrag);
            return;
        }
        Knoten aeffchen = erster;
        while(aeffchen.getNaechster() != null){
            aeffchen = aeffchen.getNaechster();
        }
        aeffchen.setNaechster(new Knoten(eintrag));
    }

    public int anzahlElemente(){
        if(erster == null){
            return 0;
        }
        int count = 1;
        Knoten aeffchen = erster;
        while(aeffchen.getNaechster() != null){
            aeffchen = aeffchen.getNaechster();
            count++;
        }
        return count;
    }

    public String loescheKnotenMitName(String name){
        if(erster.getInhalt().getKontakt().equals(name)){
            return "Liste leer";
        }
        if(erster.getInhalt().getKontakt().equals(name)){
            erster = null;
            return "erfolgreich";
        }
        Knoten aeffchen = erster;
        while(aeffchen.getNaechster() != null){
            if(aeffchen.getNaechster().getInhalt().getEintrag().equals(name)){
                aeffchen.setNaechster(aeffchen.getNaechster().getNaechster());
                return "erfolgreich";
            }
            aeffchen = aeffchen.getNaechster();
        }
        return "nicht gefunden";
    }
}