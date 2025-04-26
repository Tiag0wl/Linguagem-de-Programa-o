    public class Item {
        private String codigo;
        private String descricao;
        private int quantidade;
        private double desconto;
        private double preco_unitario;
    
    
    
    public Item (String codigo, String descricao, int quantidade, double desconto, double preco_unitario){
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.preco_unitario = preco_unitario;
    }
    
    public double calcular_Total (){
        double valor_total;    
        
        valor_total= (this.quantidade*this.preco_unitario)-((this.quantidade*this.preco_unitario)*this.desconto);
        
        return valor_total;
}
    public String getCodigo(){
        return this.codigo;
         }
    public String getDescricao(){
        return this.descricao;
         }
    public int getQuantidade(){
        return this.quantidade;
         }
    public double getDesconto(){
        return this.desconto;
         }
    public double getPrecoUnitario(){
        return this.preco_unitario;
         }
    public void setDesconto(double desc){
          this.desconto=desc;
         }
    public void setDescricao(String descr){
          this.descricao=descr;
         }
    public void setQuantidade(int quant){
          this.quantidade=quant;
         }
    public void setCodigo(String cod){
          this.codigo=cod;
         }
    }
