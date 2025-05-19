public class Pessoa {
    protected String nome;
    protected String dataDeNascimento;
    

    public Pessoa(String nome, String dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public String getNome() {
        return nome;
    }
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public String toString (){
        String nom = "Nome: " + nome;
        String dataNasc = "Data de Nascimento: " + dataDeNascimento;
        return nom + dataNasc;
    }
    
}
