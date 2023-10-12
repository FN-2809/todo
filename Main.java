public class Main {

    public static void main(String[] args){
        VerketteteListe todoListe = new VerketteteListe();
        todoListe.anhaengen(new Eintrag("09:00", "Clara", "Frühstück"));
        todoListe.anhaengen(new Eintrag("11:00", null, "Schwimmbad"));
    }
}
