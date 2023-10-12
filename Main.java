public class Main {

    public static void main(String[] args){
        VerketteteListe todoListe = new VerketteteListe();
        todoListe.anhaengen(new Eintrag("09:00", "Clara", "Frühstück"));
        todoListe.anhaengen(new Eintrag("11:00", "null", "Schwimmbad"));
        todoListe.anhaengen(new Eintrag("14:00", "Matze", "Mittagessen"));
        todoListe.anhaengen(new Eintrag("17:00", "null", "Grillen"));
        todoListe.anhaengen(new Eintrag("19:00", "null", "Pokerturnier"));
        todoListe.printList();
        System.out.println();
        todoListe.loescheKnotenMitName("Clara");
        todoListe.printList();
        System.out.println();
        todoListe.loescheKnotenMitName("Matze");
        todoListe.printList();
    }
}
