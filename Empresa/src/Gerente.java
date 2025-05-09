public class Gerente extends Funcionario {
    private int senha;
    private int  numFuncionariosGerenciados;
    
    public double getBonificacao() {
        return this.salario*0.15;
    }
    public int getSenha() {
        return senha;
    }
    public int getNumFumciomariosGerenciados() {
        return numFuncionariosGerenciados;
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
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public void setNumFuncionariosGerenciados(int numFuncionariosGerenciados) {
        this.numFuncionariosGerenciados = numFuncionariosGerenciados;
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
    
    public boolean autentica(int senha) {
        if( this.getSenha() == senha){
            System.out.println("Acesso Permitido!");
            return true;
        }else{
            System.out.println("Acesso Negado");
            return false;
        }
    }
    
}
