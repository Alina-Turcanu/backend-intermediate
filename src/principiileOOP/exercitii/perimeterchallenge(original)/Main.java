package exercitii.perimeterchallenge;

public class Main {
    public static void main(String[] args) {
        // (-1,3)
        // (-1,-1),
        // (4,-1),
        // (1,3)

        //1. rezolva problema pe un exemplu
        //2. scrie ce ai facut
        //3. gasesti pattern-uri si dezvolti un algoritm
        //4. verifica algoritmul de mana
        //5. tradu in cod
        //6. testam si debug


        //calculez distanta de la P1 la P2
        //pana acum am 4
        //calculez distanta de la P2 la P3
        //adaug la 4 pe 5 si imi da 9
        //calculez disnta de la P3 la P4
        // adaug la 9 pe 5 si imi da 14
        //calculez distanta de la P4 la P1
        //adaug la 14 pe 2 si imi da 16
        //16 este rezultatul

        //generalizam

        //calculez distanta de la P1 la P2 (currDist = 4)
        //pana acum am currDist
        //calculez distanta de la P2 la P3 (currDist = 5)
        //adaug la 4 pe currDist si imi da 9
        //calculez disnta de la P3 la P4 (currDist = 5)
        // adaug la 9 pe currDist si imi da 14
        //calculez distanta de la P4 la P1 (currDist = 2)
        //adaug la 14 pe currDist si imi da 16
        //16 este rezultatul

        //totatlPerim este initial 0
        //calculez distanta de la P1 la P2 (currDist = 4)
        //totalPerim devine totalPerim + currDist
        //calculez distanta de la P2 la P3 (currDist = 5)
        //totalPerim devine totalPerim + currDist
        //calculez disnta de la P3 la P4 (currDist = 5)
        //totalPerim devine totalPerim + currDist
        //calculez distanta de la P4 la P1 (currDist = 2)
        //totalPerim devine totalPerim + currDist
        //totalPerim este rezultatul


        //totalPerim este initial 0
        //pentru toate punctele din array (pana la penultimul)
           //calculez distanta de la points[i] la points[i+1] (currDist)
           //totalPerim devine totalPerim + currDist
        //calculez disntata dela ultimul (lenght-1) la primul (0)
        //totalPerim devine totalPerim + currDist
        //returnez totalPerim



        //varianta 2

        //totatlPerim este initial 0
        //calculez distanta de la P1 la P2 (currDist = 4)
        //totalPerim devine totalPerim + currDist
        //calculez distanta de la P2 la P3 (currDist = 5)
        //totalPerim devine totalPerim + currDist
        //calculez disnta de la P3 la P4 (currDist = 5)
        //totalPerim devine totalPerim + currDist
        //calculez distanta de la P4 la P1 (currDist = 2)
        //totalPerim devine totalPerim + currDist
        //totalPerim este rezultatul


        //folosim prev

        //totatlPerim este initial 0
        //initial prev este P4 (ultimul punct din array)
        //calculez distanta de la prev la P1 (currDist)
        //totalPerim devine totalPerim + currDist
        //prev devine P1
        //calculez distanta de la prev la P2 (currDist)
        //totalPerim devine totalPerim + currDist
        //prev devine P2
        //calculez disnta de la prev la P3 (currDist)
        //totalPerim devine totalPerim + currDist
        //prev devine P3
        //calculez distanta de la prev la P4 (currDist)
        //totalPerim devine totalPerim + currDist
        //prev devine P4
        //totalPerim este rezultatul

        //totatlPerim este initial 0
        //initial prev este P4 (ultimul punct din array)
        //pentru fiecare point[i] din array
             //calculez distanta de la prev la point[i]
             //totalPerim devine totalPerim + currDist
             //prev devine point[i]
        //totalPerim e rezultatul

    }

    public static double getPerimeter2(Shape shape){
        double totalPerim = 0;
        Point[] points = shape.getPoints();
        int numberOfPoints = shape.getNumberOfPoints();
        Point prev = points[numberOfPoints-1];
        for (int i = 0; i <numberOfPoints-1 ; i++) {
            totalPerim += prev.distanceTo(points[i]);
            prev = points[i];
        }
        return totalPerim;
    }

    public static double getPerimeter (Shape shape){
        double totalPerim = 0;
        Point[] points  = shape.getPoints();
        int numberOfPoints = shape.getNumberOfPoints();
        for (int i = 0; i < numberOfPoints-1; i++) {
            double currDist = points[i].distanceTo(points[i+1]);
            totalPerim = totalPerim + currDist;
        }
        totalPerim = totalPerim + points[numberOfPoints-1].distanceTo(points[0]);
        return totalPerim;


    }
}
