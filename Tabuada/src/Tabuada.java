public class Tabuada {
     private int numero;
     private int vetorDeNum[] = new int[10];
     private String texto;
     
     public Tabuada(int numero){
         this.numero = numero;
         
         for(int i= 0; i<=10; i++){
             this.vetorDeNum[i]=numero;
         }
    }
     
        public String retorneTexto(){ 
          
         if(this.numero<4){
              texto = "Tabuada de números pequenos";
         }
             if(this.numero>4 && this.numero<10){
                  texto = "Tabuada de números médios";
             }
                 if(this.numero>10){
                       texto ="Tabuada de números grandes";
                 }
                 return texto;
             }
         

        
        public void calculaTabuada(){
             for(int i=1; i<=9; i++){
                 this.vetorDeNum[i]=this.numero*i;
             }
         }
         
        public void imprimirTabuada(){
              for(int i=0; i<=10; i++){
                  System.out.println(i+"X"+this.numero+"="+this.numero*i);
              }   
        }
        public void setNumero(int num){
            this.numero=num;
        }
        
        public void setVetor(int vet[]){
            for(int i= 0; i<=10; i++){
             this.vetorDeNum[i]=numero;
        }
        
        }
}
