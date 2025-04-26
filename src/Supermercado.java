public class Supermercado {

    public static void main(String[] args) {
        Item i1 = new Item("001", "NESCAU", 5, 0.5, 15.00 );
        Item i2 = new Item("002", "TODDY", 4, 0.5, 10.00 );
        Item i3 = new Item("003", "NUTELLA", 1, 0.0, 20.00 );
        Item i4 = new Item("004", "TRENTO", 3, 0.5, 4.00 );
        double valorTotal = (i1.calcular_Total()+i2.calcular_Total()+i3.calcular_Total()+i4.calcular_Total());
        
        System.out.println("\t"+"\t"+"\t"+"  CUPOM FISCAL:");
        System.out.println("  ");
        System.out.println("ITEM  CODIGO     DESCRICAO\t" +"QTD.\t"+"VL UNIT R$\t"+"ST\t" + "VL ITEM");
        System.out.println("------------------------------------------------------------------------");
        System.out.println(" 1" + "\t"+ i1.getCodigo()+"\t"+i1.getDescricao()+"  \t"+i1.getQuantidade()+"UN"+"\t"+"X"+"  R$"+i1.getPrecoUnitario()+"\t"+i1.getDesconto()+"\t"+i1.calcular_Total());
        System.out.println(" 2" + "\t"+ i2.getCodigo()+"\t"+i2.getDescricao()+"   \t"+i2.getQuantidade()+"UN"+"\t"+"X"+"  R$"+i2.getPrecoUnitario()+"\t"+i2.getDesconto()+"\t"+i2.calcular_Total());
        System.out.println(" 3" + "\t"+ i3.getCodigo()+"\t"+i3.getDescricao()+" \t"+i3.getQuantidade()+"UN"+"\t"+"X"+"  R$"+i3.getPrecoUnitario()+"\t"+i3.getDesconto()+"\t"+i3.calcular_Total());
        System.out.println(" 4" + "\t"+ i4.getCodigo()+"\t"+i4.getDescricao()+"  \t"+i4.getQuantidade()+"UN"+"\t"+"X"+"  R$"+i4.getPrecoUnitario()+"\t"+i4.getDesconto()+"\t"+i4.calcular_Total());
        System.out.println(" ");
        System.out.println("                       TOTAL R$"+"\t"+"R$"+valorTotal);
        
        i1.setCodigo("005");
        i2.setDescricao("BIS");
        i3.setQuantidade(4);
        i4.setDesconto(0.50);
        
        System.out.println("  ");
        
        System.out.println("\t"+"\t"+"\t"+"  CUPOM FISCAL:");
        System.out.println("  ");
        System.out.println("ITEM  CODIGO     DESCRICAO\t" +"QTD.\t"+"VL UNIT R$\t"+"ST\t" + "VL ITEM");
        System.out.println("------------------------------------------------------------------------");
        System.out.println(" 1" + "\t"+ i1.getCodigo()+"\t"+i1.getDescricao()+"  \t"+i1.getQuantidade()+"UN"+"\t"+"X"+"  R$"+i1.getPrecoUnitario()+"\t"+i1.getDesconto()+"\t"+i1.calcular_Total());
        System.out.println(" 2" + "\t"+ i2.getCodigo()+"\t"+i2.getDescricao()+"   \t"+i2.getQuantidade()+"UN"+"\t"+"X"+"  R$"+i2.getPrecoUnitario()+"\t"+i2.getDesconto()+"\t"+i2.calcular_Total());
        System.out.println(" 3" + "\t"+ i3.getCodigo()+"\t"+i3.getDescricao()+" \t"+i3.getQuantidade()+"UN"+"\t"+"X"+"  R$"+i3.getPrecoUnitario()+"\t"+i3.getDesconto()+"\t"+i3.calcular_Total());
        System.out.println(" 4" + "\t"+ i4.getCodigo()+"\t"+i4.getDescricao()+"  \t"+i4.getQuantidade()+"UN"+"\t"+"X"+"  R$"+i4.getPrecoUnitario()+"\t"+i4.getDesconto()+"\t"+i4.calcular_Total());
        System.out.println(" ");
        System.out.println("                       TOTAL R$"+"\t"+"R$"+valorTotal);
        
        valorTotal = +(i1.calcular_Total()+i2.calcular_Total()+i3.calcular_Total()+i4.calcular_Total());
        
        System.out.println("                       TOTAL R$"+"\t"+"R$"+valorTotal);
    }
    
}
