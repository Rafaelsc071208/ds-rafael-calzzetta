import java.util.Scanner;

public class Exercicio01{
public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o nome do funcionário: ");
        String name = scanner.nextLine();

    


        System.out.println("Escreva o número de horas trabalhadas no mês: ");
        Float hour = scanner.nextFloat();
        


            System.out.println("Escreva o salário por hora: ");
            Float sala = scanner.nextFloat();

 
            System.out.println("Escreva o número de filhos: ");
            Float fil = scanner.nextFloat();


                System.out.println("Escreva quanto o funcionário já trabalhou em anos: ");
                Float temp = scanner.nextFloat();
               

                    System.out.println("Escreva a idade: ");
                    Float id = scanner.nextFloat();

float salbrut=(sala*hour);
float inps=((salbrut/100)*(17/2));
float adic=0;
float renda=0;
if (salbrut>1500){
    renda=(salbrut/100)*15;
}
if (salbrut<1500 && salbrut>500){
    renda=(salbrut/100)*8;
}
if (id>40){
    adic=(salbrut/100)*2;
}
if (temp>15){
    adic=(salbrut/100)*7.0/2.0;
}
if (temp<=15 && temp>5 && id>30){
    adic=(salbrut/100)*3.0/2.0;
}

float salfim = (salbrut-inps+adic+renda);

System.out.print("O funcionário "+name+", tem um salário bruto de "+salbrut+", contando com o desconto do INPS de "+inps+", e os adicionais do imposto de renda de "+renda+", e do ADIC de "+adic+", o seu salário com os descontos e adicionais será "+salfim+"");
            
           
       

}      
}      





