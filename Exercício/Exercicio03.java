import java.util.Scanner;

public class Exercicio02{
public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva a medida do lado A: ");
        Float la = scanner.nextFloat();

    


        System.out.println("Escreva a medida do lado B: ");
        Float lb = scanner.nextFloat();
        


            System.out.println("Escreva a medida do lado C: ");
            Float lc = scanner.nextFloat();
float bc=lb+lc;
float bc2=(lb*lb)+(lc*lc);
float a2=la*la;
            if (la>bc){
               System.out.println("Não forma triângulo");
            }
              if (a2==bc2){
               System.out.println("Forma um triângulo retângulo");
            }
            if (a2>bc2){
               System.out.println("Forma um triângulo obrusângulo");
            }
            if (a2<bc2){
               System.out.println("Forma um triângulo ocutângulo");
            }
            if (la==lb && la==lc){
               System.out.println("Forma um triângulo equilátero");
            }
            if (la == lb || la == lc || lb == lc){
               System.out.println("Forma um triângulo isósceles");
            }





            
           
       

}      
}  
