import java.util.Scanner;

public class Exercicio02{
public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o sexo do funcionário sendo 1 para homem e 2 para mulher: ");
        Float sexo = scanner.nextFloat();

    


        System.out.println("Escreva o número de anos trabalhados: ");
        Float time = scanner.nextFloat();
        


            System.out.println("Escreva o salário: ");
            Float sala = scanner.nextFloat();
float bonus=100;
            if (sexo==1) if(time>15){
                bonus=(sala/100)*20;
            }
                if (sexo==2) if(time>10){
                    bonus=(sala/100)*25;
                }


float total=sala+bonus;
System.out.print("O valor do bonus da pessoa somada com seu salário será de "+total+"");
            
           
       

}      
}      






