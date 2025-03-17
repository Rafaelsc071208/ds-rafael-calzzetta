import java.util.Scanner;

public class Condicao{
    public static void main(String[] args){
        Scanner v1 = new Scanner(System.in);
        System.out.println("Escreva o primeiro número: ");
        int n1 = v1.nextInt();
        int v2 = 18;
        if (n1>v2){
            System.out.println(n1+" é maior que "+v2);
        } else{
            System.out.println(n1+" é menor que "+v2);
        }
}
}