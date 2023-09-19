public class SomaRieman {
    //fazer a soma de Rieman
    //Arthur

    private int subIntervalos;
    private double r;
    private double[] dados;

    
    public SomaRieman(int subIntervalos) {
        this.subIntervalos = subIntervalos+1;
        this.r = 0;
        this.dados = new double[this.subIntervalos];
    }


    public void inPole(double a ,double b){
      //nao entendo pq da 0 
     // explicaçãoa: é uma formula para ver os subintervalos
     // o c nao deveria dar zero é da formula eu so modifiquei ela one
     
     
        this.r = a +(this.subIntervalos-2);
        double c  = b/this.r;
        this.dados[0] = a;
        for(int i =0;i<this.subIntervalos;i++){
        if (i != 0) {
            this.dados[i] = this.dados[i-1] + c;
        }
        
        }

    }

    

}
