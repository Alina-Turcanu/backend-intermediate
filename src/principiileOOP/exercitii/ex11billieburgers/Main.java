package exercitii.ex11billieburgers;

public class Main {

    //11. Ajuta-i pe Bills Burgers sa isi gestioneze procesul de vanzare a burgerilor.
    //Scopul aplicației este să ajute o companie fictivă numită Bills Burgers să-și gestioneze procesul de vânzare a hamburgerilor.
    // Aplicația noastră îl va ajuta pe Bill să selecteze tipuri de hamburgeri, unele dintre produsele adiționale (adăugiri)
    // care trebuie adăugate la hamburgeri și stabilirea prețurilor.
    //
    //Descrierea Hamburgerului de Bază
    //Vrem să creăm un hamburger de bază, dar și alte două tipuri de hamburgeri care sunt cele mai populare în magazinul lui Bill.
    // Hamburgerul de bază ar trebui să aibă următoarele ingrediente:
    //
    //Tip de chiflă
    //Carnea folosita
    //Pretul de baza
    //Până la 4 adăugiri suplimentare (lucruri precum salată verde, roșii, morcovi, etc.) pe care clientul le poate selecta pentru a fi adăugate la hamburger.
    //Fiecare dintre aceste produse are un preț suplimentar, așa că ai nevoie de o metodă de a urmări câte produse au fost adăugate
    // și de a calcula prețul final (hamburgerul de bază cu toate adăugirile).
    // Acest hamburger are un preț de bază, iar adăugirile au toate prețuri separate (până la 4 adăugiri).
    //
    //Clasa Hamburger
    //Crează o clasă Hamburger pentru a gestiona tot ce este mai sus. Constructorul ar trebui să primeasca ca parametru includă tipul de chiflă, carnea și prețul.
    //
    //Varietăți Suplimentare de Hamburgeri
    //De asemenea, creează alte două varietăți de hamburgeri (subclase) pentru:
    //
    //Hamburger Sănătos:
    //
    //Tipul de chifla este chiflă de secară brună
    //Pana la 6 adaugiri suplimentare
    //carne (mostenita din superclasa)
    //pret de baza (mostenita din superclasa)
    //Hamburger Deluxe:
    //
    //Vine cu maxim 2 adaugiri: cartofi prăjiți și băutura (nu sunt permise alte adăugiri)
    //Prețuri și Totaluri
    //Trebuie sa putem arăta prețul de bază al hamburgerului (indiferent de ce tip este), plus toate adaugirile (numele și prețul fiecarei adăugiri), și un pret total pentru hamburger (prețul de bază + toate adăugirile).

    public static void main(String[] args) {
        BaseBurger burger = new BaseBurger("paine alba", MeatType.PORC, new Addition[]{new Addition("salata",2), new Addition("paine",3)});
        System.out.println(burger.getPrice());

        BaseBurger healthy = new HealthyBurger(MeatType.PUI,new Addition[]{new Addition("salata",2), new Addition("cartofi",3)});
        healthy.getPrice();
        healthy.cook();
        burger.cook();
    }

}
