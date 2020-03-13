import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Nota{
    public static void main(String[] args){
        DecimalFormat nota = new DecimalFormat("##.00");
        int i, somatorio = 0;
        Scanner aux = new Scanner(System.in);
        
        for(i = 0; i < 4; i++){
            System.out.printf("Digite a %dª nota: ",i+1);
            somatorio = somatorio + (aux.nextInt());
        }
      
            double media = (double)(somatorio)/i;
        
        System.out.println("Média Aritmética: "+nota.format(media));
    }
}
