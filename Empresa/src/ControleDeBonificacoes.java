class ControleDeBonificacoes extends Gerente {
    private double totalDeBonificacoes = 0;
    
    public void registrar(Funcionario funcionario) {
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }
    
    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }
}
