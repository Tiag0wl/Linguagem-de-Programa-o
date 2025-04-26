public class Aluno {

    private String codigo;
    private String nome;
    private int anoNascimento;
    private int mesNascimento;
    private int diaNascimento;
    private int nota1;
    private int nota2; 
    private double mediaNotas;
    private int anoAtual = 2025;
    private int mesAtual = 3;
    private int idadeMes;
    private int idadeAnos;
    
    public Aluno (String codigo, String nome, int anoNascimento, int mesNascimento, int diaNascimento, int nota1, int nota2) {
        this.codigo = codigo;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
     public int getIdadeAnos() {
         idadeAnos = anoAtual - anoNascimento;
         return this.idadeAnos;
     }
    
    public int getIdadeMeses() {
         if(mesNascimento > mesAtual){
             anoAtual = anoAtual - 1;
         }
           int idadeAno = anoAtual - anoNascimento;

           if(mesNascimento < mesAtual){
            mesAtual = mesAtual - 12;
           }
           idadeMes = idadeAno*12 + ((mesAtual + 12) - mesNascimento);
           
           if(mesNascimento == mesAtual){
               idadeMes = idadeAno*12;
           }
           return this.idadeMes;
    }
   public double getMediaNotas() {
       this.mediaNotas = (this.nota1 + this.nota2)/2;
       return this.mediaNotas;
   }
   public void InfoAluno() {
       System.out.println("codigo: " + this.codigo);
       System.out.println("nome: " + this.nome);
       System.out.println("ano: " + this.anoNascimento);
       System.out.println("mes: "   + this.mesNascimento);
       System.out.println("dia: " + this.diaNascimento);
       System.out.println("nota1: " + this.nota1);
       System.out.println("nota2: " +this.nota2);
       System.out.println( "media notas: " +  this.getMediaNotas() );
       System.out.println("idade anos: "+  this.getIdadeAnos());
       System.out.println("idade mes: " + this.getIdadeMeses());
      
   }
}
