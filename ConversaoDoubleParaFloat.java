public class ConversaoDoubleParaInt {

  public static void main(String[] args) {
   double largura = 100;
   int tamanho = largura; // nao compila

   int tamanho = (int) largura; // isso compila

   System.out.println(tamanho);
  }  

}