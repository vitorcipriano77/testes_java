import java.util.Scanner;

public class ControlePesoAeronave {

   public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);

     System.out.print("Peso maximo da aeronave: ");
     int pesoMaximo = entrada.nextInt();

     int pesoTotalPassageiros = 0;
     boolean incluirNovoPassageiro = true;

   while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro) {
   System.out.print("Peso do passageiro: ");
   int pesoPassegeiro = entrada.nextIn();

   pesoTotalPassageiros += pesoPassageiros;

  System.out.print("Incluir novo passageiro? ");
  incluierNovoPassageireo = entrada.nextBoolean;

  } 
    System.out.printf("Peso maximo da aeronave: %d kg%n", pesoMaximo);
    System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
    System.out.printf("Situação da aeronave: %s%n",
    pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "Liberada");
 }

}