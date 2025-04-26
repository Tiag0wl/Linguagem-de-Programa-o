public class ContaCorrente {
    private int numeroConta;
    private String nomeConta;
    private double saldoConta;
    private double limiteConta;

public ContaCorrente (int numeroConta, String nomeConta, double saldoConta, double limiteConta){
this.numeroConta = numeroConta;
this.nomeConta = nomeConta;
this.saldoConta = saldoConta;
this.limiteConta = limiteConta;
}

public void setNumero(int numerooConta){
    this.numeroConta = numerooConta;
}
public void setNome(String nomeeConta){
    this.nomeConta = nomeeConta;
}
public void setSaldo(double saldooConta){
    this.saldoConta = saldooConta;
}
public void setLimite(double limiteeConta){
    this.limiteConta = limiteeConta;
}

}

