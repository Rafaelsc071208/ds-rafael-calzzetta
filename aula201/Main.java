import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nome: ");
        String name = scanner.nextLine();
                System.out.print("rmail: ");
        String mail = scanner.nextLine();
                System.out.print("idade: ");
        int age = scanner.nextInt();
        Usuario usuario1 = new Usuario(name ,mail, age);
        
        usuario1.exibirInfo();

        usuario1.setNome(name);

        System.out.println("\nApós Alteração de nome:");
        usuario1.exibirInfo();
    }
}