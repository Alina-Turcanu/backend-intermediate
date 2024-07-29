package exercitiiTeme.colectii;

public class Ex13 {

    //13. Implementeaza un spell checker
    //Cel mai simplu spell checker este bazat pe o lista de cuvinte cunoscute (un dictionar).
    // Daca scrii un text, fiecare cuvant trebuie cautat in lista de cuvinte cunoscute,
    // iar daca nu este gasit, inseamna ca e eronat. Implementeaza un astfel de spell checker.
    //
    //Ce intra in program?
    //Pe prima linie utilizatorul introduce numărul de cuvinte din lista de cuvinte cunoscute.
    //Apoi, pe câte o linie separată introduce fiecare cuvant din lista de cuvinte cunoscute.
    //Apoi, pe o linie, se introduce numărul de linii al textului de verificat.
    //Se introduc exact atâtea linii cu text (cuvinte separate prin spațiu).
    //Ce iese din program?
    //Trebuie să afișam acele cuvinte din text care nu se regăsesc în lista de cuvinte cunoscute.
    //Trebuie să verificăm fără să ținem cont de literele mici și mari.
    //Cuvintele care nu sunt găsite în dicționar nu ar trebui să fie duplicate, dacă le regăsim de mai multe ori în text.
    //Exemplu
    //Input:
    //3
    //a
    //bb
    //cCc
    //2
    //a bb aab aba
    //ccc c bb aaa
    //Output:
    //c
    //aab
    //aaa
    //aba
}
