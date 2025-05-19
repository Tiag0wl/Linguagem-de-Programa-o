public abstract class PessoaIMC extends Pessoa{


    public PessoaIMC(double peso, double altura,String nome, String dataDeNascimento) {
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calculaIMC(double peso, double altura){
        double IMC = peso/(altura*altura);
        return IMC;
    }
    
    public abstract resusltIMC(){
        
    }
    
}
