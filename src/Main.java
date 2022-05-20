class Main {

    public static void main(String[] args) {

        //erzeuge ein neues Objekt und setze einige Attribute
        Smartphone phone1 = new Smartphone();
        phone1.model ="Samsung Galaxy S7";
        phone1.color = "blau";
        phone1.weight = 178;
        phone1.chargeStatus=0.82;

        //erzeuge ein weiteres neues Objekt und setze einige Attribute
        Smartphone phone2 = new Smartphone();
        phone2.model = "iPhone XS";
        phone2.weight=172;
        phone2.os="iOS";

        //rufe eine Methode mit Objekten als Argument auf
        printColor(phone1);
        printColor(phone2);

        //diese Methode liefert auch ein Objekt zurück
        Smartphone heavyPhone = heavierPhone(phone1, phone2);
        System.out.println("Das schwerere Telefon ist das " +heavyPhone.model+".");
    }

    //Der Klassenname dient als Datentyp des Parameters
    public static void printColor(Smartphone sp) {
        System.out.println("Das Handy hat die Farbe "+sp.color+".");
    }

    //diese Methode liefert ein Objekt vom Typ Smartphone zurück
    public static Smartphone heavierPhone (Smartphone s1, Smartphone s2) {
        if (s1.weight > s2.weight) {
            return s1;
        } else {
            return s2;
        }
    }
}