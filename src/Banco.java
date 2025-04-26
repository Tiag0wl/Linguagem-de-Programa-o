public class Banco {

    public static void main(String[] args) {
    Conta teste = new Conta (001, "Tiago", 500, 500);
    teste.Sacar(500);
    teste.Depositar(1700);
    
        System.out.println("NUMERO DA CONTA: " + teste.getNumero());
        System.out.println("SALDO DA CONTA: " + teste.getSaldo());
    }
}
