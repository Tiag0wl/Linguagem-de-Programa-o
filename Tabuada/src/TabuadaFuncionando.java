import java.util.Scanner;
public class TabuadaFuncionando {

    public static void main(String[]args){
      Scanner leitor = new Scanner(System.in);        
      int numero = leitor.nextInt();
      // int vetor = leitor.nextInt();
      Tabuada t1 = new Tabuada(numero);
        System.out.println(t1.retorneTexto());
        
        t1.calculaTabuada();
        t1.imprimirTabuada();
    }
}
