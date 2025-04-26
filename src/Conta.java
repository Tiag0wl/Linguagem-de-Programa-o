public class Conta {
    protected int numeroConta;
    protected String nomeConta;
    protected double saldoConta;
     private double limiteConta;

public Conta (int numeroConta, String nomeConta, double saldoConta, double limiteConta){
this.numeroConta = numeroConta;
this.nomeConta = nomeConta;
this.saldoConta = saldoConta;
this.limiteConta = limiteConta;
}

public int getNumero() {
    return this.numeroConta;
}
public String getNome() {
    return this.nomeConta;
}
public double getSaldo() {
    return this.saldoConta;
}
public double getLimite() {
    return this.limiteConta;
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

public double Sacar (double valorSacado){
    if(valorSacado <= limiteConta){
       saldoConta = saldoConta - valorSacado; 
    }
    return saldoConta;
}
public double Depositar (double valorDepositado){
    saldoConta = saldoConta + valorDepositado;
    return saldoConta;
}

}