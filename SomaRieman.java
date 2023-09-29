public class SomaRieman {
    //fazer a soma de Rieman
    //Arthur

    private int subIntervalos;
    private double r;
    private double[] dados;
    private double a;
    private double b;
    public  double deltaX;

    
    public SomaRieman(int subIntervalos ,  double limiteSuperior,double limiteinferior) {
        this.subIntervalos = subIntervalos+1;
        this.r = 0;
        this.dados = new double[this.subIntervalos];
        this.a = limiteinferior;
        this.b = limiteSuperior;
        
    }


    public double[] inPole( ){
     this. deltaX = (b-a)/(this.subIntervalos-1);
        this.r = a +(this.subIntervalos-2);
        double c  = b/this.r;
        this.dados[0] = a;
        for(int i =0;i<this.subIntervalos;i++){
        if (i != 0) {
            this.dados[i] = this.dados[i-1] + c;
        }
        
        }
       return this.dados;
        
    }

    public void calculoArea( ){
        
        
      
    }



}
