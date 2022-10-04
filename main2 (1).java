import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner console = new Scanner(System.in);
// Variavel
  double C,F;
          
  // processamento
  System.out.println(" Qual a temperatura em  Fahrenheit ?:");
  F = console.nextDouble();
  
  C = 5 * ((F-32) / 9);
  //saida 
 System.out.printf("\n A temperaura em celsius e !\n"  + C);
    
  }
}