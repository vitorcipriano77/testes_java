import java.util.Scanner;

public class ApostaMegasena {

   public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
   
     int quantidadeNumeros = 0;

     do {
     System.out.print("Quantidade de numeros: ");
     int quantidadeNumeros = entrada.nextInt();
    
      if (quantidadeNumeros < 6 || quantidadeNumeros > 15) {
        System.out.println("A quantidade de números deve ser entre 6 e 15.");
      }
    } while (quantidadeNumeros < 6 || quantidadeNumeros > 15);

    int numeroAtual = 1;
    String numeroEscolhidos = "";

     do {
        System.out.printf("Número %d/%d:  ", numeroAtual, quantidadeNumeros);

       numeroAtual++
     } while (numeroAtual <= quantidadeNumeros);
  }

}