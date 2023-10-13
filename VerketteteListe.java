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
        if(this.istLeer()){
            return "Liste leer";
        }
        if(erster.getInhalt().getKontakt().equals(name)){
            erster = erster.getNaechster();
            return "erfolgreich";
        }
        Knoten aeffchen = erster;
        while(aeffchen.getNaechster() != null){
            if(aeffchen.getNaechster().getInhalt().getKontakt().equals(name)){
                aeffchen.setNaechster(aeffchen.getNaechster().getNaechster());
                return "erfolgreich";
            }
            aeffchen = aeffchen.getNaechster();
        }
        return "nicht gefunden";
    }

    public void printList(){
        if(!this.istLeer()){
            Knoten aeffchen = erster;
            while(aeffchen.getNaechster() != null){
                aeffchen.printNode();
                aeffchen = aeffchen.getNaechster();
            }
            aeffchen.printNode();
        }
    }

    public Eintrag inhalt(int index){
        if((index < 0) || (index >= this.anzahlElemente())){
            return new Eintrag(null, null, null);
        }

        Knoten aeffchen = erster;
        for(int i = 0; i < index; i++){
            aeffchen = aeffchen.getNaechster();
        }
        return aeffchen.getInhalt();
    }

    public void ersetzen(int index, Eintrag neu){
        if((index < 0) || (index >= this.anzahlElemente())){
            return;
        }

        Knoten aeffchen = erster;
        for(int i = 0; i < index; i++){
            aeffchen = aeffchen.getNaechster();
        }
        aeffchen.setInhalt(neu);
    }

    public void einfuegen(int index, Eintrag neu){
        if((index < 0) || (index >= this.anzahlElemente())){
            return;
        }

        Knoten neuerKnoten = new Knoten(neu);

        if(index == 0){
            neuerKnoten.setNaechster(erster.getNaechster());
            this.erster = neuerKnoten;
            return;
        }

        Knoten aeffchen = erster;
        for(int i = 0; i < (index - 1); i++){
            aeffchen = aeffchen.getNaechster();
        }
        neuerKnoten.setNaechster(aeffchen.getNaechster().getNaechster());
        aeffchen.setNaechster(neuerKnoten);
    }

    public Eintrag entfernen(int index){
        Eintrag inhalt = new Eintrag(null, null, null);
        if((index < 0) || (index >= this.anzahlElemente())){
            return inhalt;
        }

        if(index == 0){
            inhalt = erster.getInhalt();
            erster = erster.getNaechster();
        }else{
            Knoten aeffchen = erster;
            for(int i = 0; i < (index - 1); i++){
                aeffchen = aeffchen.getNaechster();
            }
            inhalt = aeffchen.getNaechster().getInhalt();
            aeffchen.setNaechster(aeffchen.getNaechster().getNaechster());
        }
        return inhalt;
    }

    public void entfernen(Eintrag index){

    }
}