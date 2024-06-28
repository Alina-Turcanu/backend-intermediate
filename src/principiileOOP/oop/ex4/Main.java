package oop.ex4;

public class Main {
        public static void main(String[] args) {
            User user = new User();
            user.setName("John Grant");

            BaseEntity userEntity = user;
            userEntity.setId(100);
            userEntity.setVersion(1);

           WebSite site = new WebSite();
            site.setUrl("https://hyperskill.org");

            BaseEntity siteEntity = site;
            siteEntity.setId(101);
            siteEntity.setVersion(1);

            Visit visit = new Visit();
            visit.setUser(user);
            visit.setSite(site);

            BaseEntity baseVisit = visit;
            baseVisit.setId(102);
            baseVisit.setVersion(103);

            // Afișăm informațiile pentru verificare
            System.out.println("User: " + user.getName() + ", ID: " + user.getId() + ", Version: " + user.getVersion());
            System.out.println("WebSite: " + site.getUrl() + ", ID: " + site.getId() + ", Version: " + site.getVersion());
            System.out.println("Visit: User ID: " + visit.getUser().getId() + ", Site ID: " + visit.getSite().getId() + ", ID: " + visit.getId() + ", Version: " + visit.getVersion());
        }
    }
