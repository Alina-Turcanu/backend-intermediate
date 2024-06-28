package exercitii.ex9parkingapp;

public class Main {

    //9. Parcările sunt o necesitate urbană.
    //Varianta 1
    //Ele oferă locuri unde poți lăsa mașina fără să-ți faci griji că ar fi furată sau ridicată. Sistemele moderne de parcare auto sunt automate și sunt capabile de auto-gestionare. În acest proiect, vei crea un sistem similar, dar într-o formă simplificată.
    //
    //Să începem prin scrierea unui program care poate plasa mașina ta într-o parcare și elibera locul atunci când mașina pleacă. Acesta va fi "scheletul" parcării noastre funcționale și vom adăuga la el în pașii următori. În momentele aglomerate, parcarea poate rămâne fără locuri vacante. Programul ne va oferi informații agregate despre starea actuală a parcării.
    //
    //Prima versiune a programului tău ar trebui să afișeze următoarele, ca exemplu:
    //
    //Mașina albă cu numarul BN39GIM a parcat.
    //Mașina galbenă cu numarul HD23ABC a părăsit parcarea.
    //Mașina verde cu numarul CJ96BOS a parcat.

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLot.status();
        parkingLot.park(new Car("CJ01BOS","roz"));
        parkingLot.park(new Car("CJ99SAR", "alba"));
        parkingLot.leave("CJ01BOS");
        parkingLot.park(new Car("CJ98ABC", "neagra"));
        parkingLot.status();

    }
}
//TODO de facut varianta 4