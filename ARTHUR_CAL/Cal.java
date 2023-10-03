import javax.swing.JOptionPane;

public class Cal {
    private double a;
    private double b;
    private int n;
    private double soma;
    public Cal(double a, double b, int n){
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public void calculoEsquerdo(){
       
        double t,y = 0;
        double num =((b-a)/n);
        double i = a;
        StringBuilder divisoesEsquerda = new StringBuilder();
        while(i<=b-num){
          y = func(i)+y;
          t = func(i);
          divisoesEsquerda.append("Divisões do lado esquerdo: ").append(t).append("    Soma:  ").append(y).append("\n");
            i=i+num;
        }   JOptionPane.showMessageDialog(null, divisoesEsquerda.toString(), "Divisões do lado esquerdo", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Resultado final: " + (y * num), "Resultado", JOptionPane.INFORMATION_MESSAGE);


        

    }
    public void calculoDireito(){
        double t,y=0;
        double num = (b-a)/n;
        double i = b;
        StringBuilder divisoesDireita = new StringBuilder();

        while(i>=a+num){
            y = func(i)+y;
            t = func(i);
           
          divisoesDireita.append("Divisões do lado direito: ").append(t).append("    Soma:  ").append(y).append("\n");
            
            i=i-num;
        } JOptionPane.showMessageDialog(null, divisoesDireita.toString(), "Divisões do lado direitp", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Resultado final: " + (y * num), "Resultado", JOptionPane.INFORMATION_MESSAGE);
}
    public double func(double x){
        return Math.pow(x, 2)+4;
    }
}
