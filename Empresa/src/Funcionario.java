public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public double getBonificao() {
        return this.salario*10;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
