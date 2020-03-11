import java.util.Scanner;
import java.math.BigDecimal;

public class Nota{
    public static void main(String[] args){
        int i, somatorio = 0;
        Scanner aux = new Scanner(System.in);
        
        for(i = 0; i < 4; i++){
            System.out.printf("Digite a %dª nota: ",i+1);
            somatorio = somatorio + (aux.nextInt());
        }
      
        BigDecimal media = (new BigDecimal(somatorio)).divide((new BigDecimal(i)), 2, BigDecimal.ROUND_HALF_EVEN);
        
        System.out.println("Média Aritmética: "+media);
    }
}
