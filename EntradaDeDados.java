import java.util.Scanner; 

   public class EntradaDeDados {

  public static void main(String[] args) 
 {
    Scanner entrada = new scanner(System.in)

    System.out.println("Digite o seu nome:");

    String nome = entrada.nextLine();

    System.out.printf("Oi, %s%n", nome);
  }  

}