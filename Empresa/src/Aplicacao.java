public class Aplicacao {

    public static void main(String[] args) {
   
        Funcionario f1 = new Funcionario();
        f1.setNome("Aluno Ricer");
        f1.setCpf("02344328402");
        f1.setSalario(1000);
        System.out.println("Funcionario");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Cpf: " + f1.getCpf());
        System.out.println("Salario: " + f1.getSalario());
        System.out.println("Bonificacao: " + f1.getBonificao());
         
         Gerente g1 = new Gerente();
         g1.setNome("Luan");
         g1.setCpf("03213801");
         g1.setSalario(2000);
         g1.setSenha(1234);
         g1.setNumFuncionariosGerenciados(50);
         if(g1.autentica(1234)) {       
        System.out.println("Gerente");
        System.out.println("Nome: " + g1.getNome());
        System.out.println("Cpf: " + g1.getCpf());
        System.out.println("Salario: "+ g1.getSalario());
        System.out.println("Bonificacao: " + g1.getBonificao());
         }else{
             System.out.println("Senha Incorreta");
         }
         
         ControleDeBonificacoes C1 = new ControleDeBonificacoes();
         
    }
    
}
