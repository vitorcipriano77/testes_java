public class CaixaLoja {

   public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);

     System.out.print("Avalie o nosso atendimento (1 a 5): ");
     int nota = entrada.nextInt();

    String descircaoNota;

    switch (nota) {
      case 1:
        descricaoNota = "Muito ruim";
        System.out.println(1);
      break;
     case 2:
        descricaoNota = "Ruim";
         System.out.printl(2)
      break;
     case 3:
        descricaoNota = "Razoavel";
         System.out.printl(3)
      break;
     case 4:
        descricaoNota = "Muito bom";
         System.out.printl(4)
      break;
     case 5:
        descricaoNota = "Exlecente";
         System.out.printl(5)
      break;
     default:
        descricaoNota = "Opção invalida";
        System.out.println("default")
      break;
   }  

    System.out.println("Sua nota foi: %d - %s%n", nota, descricaoNota);    
}