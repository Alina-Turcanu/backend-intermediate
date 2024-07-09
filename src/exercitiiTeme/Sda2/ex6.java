package exercitiiTeme.Sda2;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;


public class ex6 {
//6. Scrie o functie care accepta 2 numere reprezentand anul si luna.
//Functia va returna prima si ultima zi din luna.
//
//De exemplu, pentru anul 2017 si luna 1, functia va returna "2017-01-01
// 2017-01-31" Foloseste-te de functiile deja existente in clasa LocalDate.
public static void main(String[] args) {
    int year=2024;
    int month=10;

    String result = getFirstAndLastDayOfMonth(year, month);
    System.out.println(result);  // Output: 2017-01-01 2017-01-31
}

    public static String getFirstAndLastDayOfMonth(int year, int month) {
        // Utilizăm YearMonth pentru a reprezenta o anumită lună dintr-un anumit an
        YearMonth yearMonth = YearMonth.of(year, month);

        // Obținem prima zi a lunii
        LocalDate firstDay = yearMonth.atDay(1);

        // Obținem ultima zi a lunii
        LocalDate lastDay = yearMonth.atEndOfMonth();

        // Formatăm datele în formatul dorit
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String firstDayFormatted = firstDay.format(formatter);
        String lastDayFormatted = lastDay.format(formatter);

        return firstDayFormatted + " " + lastDayFormatted;
    }
}
