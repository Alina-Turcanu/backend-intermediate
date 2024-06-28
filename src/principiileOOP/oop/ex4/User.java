package oop.ex4;

public class User extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Ești în procesul de dezvoltare a unei aplicații care colectează informații
    // despre ce site-uri web au fost vizitate de către ce utilizatori.
    //Există trei clase: User (Utilizator), WebSite (Site web) și
    // Visit (Vizită). Multe câmpuri și metode ale acestor clase sunt identice.
    //Scrie o clasă de bază abstractă nouă numită BaseEntity (Entitate de bază).
    // Clasele furnizate trebuie să o extindă. Mută toate câmpurile și metodele
    // repetitive în noua clasă.
    //După modificările tale, următorul cod trebuie să funcționeze corect:
    //User user = new User();
    //user.setName("John Grant");
    //
    //BaseEntity userEntity = user;
    //userEntity.setId(100);
    //userEntity.setVersion(1);
    //
    //WebSite site = new WebSite();
    //site.setUrl("<https://hyperskill.org>");
    //
    //BaseEntity siteEntity = site;
    //siteEntity.setId(101);
    //siteEntity.setVersion(1);
//    Visit visit = new Visit();
//visit.setUser(user);
//visit.setSite(site);
//
//    BaseEntity baseVisit = visit;
//baseVisit.setId(102);
//baseVisit.setVersion(103);
}
