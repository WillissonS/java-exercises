import java.util.Locale;

public class Main {
    public static void main(String[] args) {

       String product1 = "Computer";
       String product2 = "Office desk";

       int age = 30;
       int code = 5290;
       char gender = 'F';

       double price1 = 2100.0;
       double price2 = 650.50;
       double measure = 53.234567;

       System.out.printf("Products:\n%s, which price is R$%.2f\n", product1, price1);
       System.out.printf("%s, wich price is R$%.2f", product2, price2);
       System.out.println("\n");
       System.out.printf("Record: %d years old, code %d and gender: %c", age, code, gender);
       System.out.println("\n");
       System.out.printf("Measure with eight decimal places: %f\n", measure);
       System.out.printf("Rouded (three decimal places): %.3f\n", measure);
       Locale.setDefault(Locale.US);
       System.out.printf("US deimal point: %.3f", measure);

        }
    }
