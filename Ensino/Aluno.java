public class Aluno {
private String nome_Aluno;
private String num_Matricula;
private String nome_Curso;
private String vetor_Disciplinas[];
private double vetor_Notas1[];
private double vetor_Notas2[];
private double vetor_Notas3[];

public Aluno (){
    this.nome_Aluno = "" ;
    this.num_Matricula = "" ;
    this.nome_Curso = "" ;
    this.vetor_Disciplinas = new String[2];
    this.vetor_Notas1 = new double[3];
    this.vetor_Notas2 = new double[3];
    this.vetor_Notas3 = new double[3];
}

    public void setNome_Aluno(String nome_Aluno) {
        this.nome_Aluno = nome_Aluno;
    }
    public void setNum_Matricula(String num_Matricula) {
        this.num_Matricula = num_Matricula;
    }
    public void setNome_Curso(String nome_Curso) {
        this.nome_Curso = nome_Curso;
    }
    public void setVetor_Disciplinas(String[] vetor_Disciplinas) {
        this.vetor_Disciplinas = vetor_Disciplinas;
    }
    public void setVetor_Notas1(double[] vetor_Notas1) {
        this.vetor_Notas1 = vetor_Notas1;
    }
    public void setVetor_Notas2(double[] vetor_Notas2) {
        this.vetor_Notas2 = vetor_Notas2;
    }
    public void setVetor_Notas3(double[] vetor_Notas3) {
        this.vetor_Notas3 = vetor_Notas3;
    }
    public String getNome_Aluno() {
        return nome_Aluno;
    }
    public String getNum_Matricula() {
        return num_Matricula;
    }
    public String getNome_Curso() {
        return nome_Curso;
    }
    public String[] getVetor_Disciplinas() {
        return vetor_Disciplinas;
    }
    public double[] getVetor_Notas1() {
        return vetor_Notas1;
    }
    public double[] getVetor_Notas2() {
        return vetor_Notas2;
    }
    public double[] getVetor_Notas3() {
        return vetor_Notas3;
    }

    public double calculaMedia(int disciplina){
        double soma1 = 0;
        double media1;
        
        if(disciplina == 1){
        for(int i=0; i<vetor_Notas1.length; i++){
            soma1 = soma1 + vetor_Notas1[i];
        }
        media1 = soma1/vetor_Notas1.length;
        return media1;
        }
        
        if(disciplina == 2){
            for(int i=0; i<vetor_Notas2.length; i++){
            soma1 = soma1 + vetor_Notas2[i];
        }
        media1 = soma1/vetor_Notas2.length;
        return media1;
        }
        if(disciplina == 3){
            for(int i=0; i<vetor_Notas3.length; i++){
            soma1 = soma1 + vetor_Notas3[i];
        }
        media1 = soma1/vetor_Notas3.length;
        return media1;
        }

        

    

