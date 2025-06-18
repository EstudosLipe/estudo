import java.util.Date;
import java.util.Calendar;

public class Main{
    public static void main(String args[]){

        // Retorna a hora atual
        Date hojeDate = new Date();
        System.out.println(hojeDate);
        // Retorna a hora atual
        Calendar hojeCalendar = Calendar.getInstance();
        System.out.println(hojeCalendar.getTime());

        // Retorna qual fragmento da data
        // System.out.println(hojeCalendar.get(Calendar.MONTH));

        hojeCalendar.set(Calendar.MONTH,Calendar.JANUARY);
        System.out.println(hojeCalendar.get(Calendar.MONDAY));

    }
}