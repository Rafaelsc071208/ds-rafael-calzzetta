import java.util.Scanner;

public class Exercicio01{
public static void main(String[] args){
        Scanner nome = new Scanner(System.in);
        System.out.println("Escreva o nome do funcionário: ");
        String name = nome.nextLine();

    

        (Scanner horas = new Scanner(System.in)) {
        System.out.println("Escreva o número de horas trabalhadas no mês: ");
        Float hour = horas.nextFloat();
        

        (Scanner sal = new Scanner(System.in)) {
            System.out.println("Escreva o salário por hora: ");
            Float sala = sal.nextFloat();

        (Scanner filho = new Scanner(System.in)) {
            System.out.println("Escreva o número de filhos: ");
            Float fil = filho.nextFloat();

            (Scanner tra = new Scanner(System.in)) {
                System.out.println("Escreva quanto o funcionário já trabalhou em anos: ");
                Float temp = tra.nextFloat();
               
                (Scanner idade = new Scanner(System.in)) {
                    System.out.println("Escreva a idade: ");
                    Float id = idade.nextFloat();

float salbrut=(sala*hour);
float inps=((salbrut/100)*(17/2));
float adic;
float renda;
if (salbrut>1500){
    renda=(salbrut/100)*15;
}
if (salbrut<1500) if(salbrut>500){
    renda=(salbrut/100)*8;
}
if (id>40){
    adic=(salbrut/100)*2;
}
if (temp>15){
    adic=(salbrut/100)*7/2;
}
if (temp<=15) if(temp>5) if(id>30){
    adic=(salbrut/100)*3/2;
}

float salfim = (salbrut-inps+adic+renda);

System.out.print("O funcionário "+name+", tem um salário bruto de "+salbrut+", contando com o desconto do INPS de "+inps+", e os adicionais do imposto de renda de "+renda+", e do ADIC de "+adic+", o seu salário com os descontos e adicionais será "+salfim+"");
            
           
       

}      
}      
}
}
}
}
}
