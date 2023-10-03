import  javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        //Main provisoria
        Identificador identificador = new Identificador();
       JOptionPane .showMessageDialog(null, "Bem vindo");
       String[] opções = {"Polinomial" , "Trigonometrica" , "Euler"};
       int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o limite superior"));
       int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o limite inferior"));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de subintervalos"));
       SomaRieman somaRieman = new SomaRieman(c, b, a);
       double[] subs = somaRieman.inPole();
       String input = (String) JOptionPane.showInputDialog(null,"Selecione a opçaõ que deseja" , "Opções " , JOptionPane.QUESTION_MESSAGE,null,opções,opções[0]);
       
       if (input.equals("Polinomial")) {
        String[] opçõesPolinomial = {"Primeiro grau" , "Segundo grau"};
        String tipoPolinomial = (String) JOptionPane.showInputDialog(null,"Selecione a opçaõ que deseja" , "Opções " , JOptionPane.QUESTION_MESSAGE,null,opçõesPolinomial,opçõesPolinomial[0]);
        
        if (tipoPolinomial.equals("Primeiro grau")) {
           int d  = Integer.parseInt(JOptionPane.showInputDialog(null, "O x tem multiplicador ? se sim insira-o a seguir, se nao insira 1"));
           char e = JOptionPane.showInputDialog(null,"Insira um operador(+,-)").charAt(0);
           int f = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o numero a ser somado"));
           double result =0.0;

           for(int i =0;i<subs.length;i++){
              double parcial =  (identificador.polinomialPrimeiroGrau(d,e,f,subs[i] )*somaRieman.deltaX);
            result = result + parcial;
                JOptionPane.showMessageDialog(null, "Dado o  subintervalo " + subs[i] +" o  resultado é "+ parcial  );
           }

           JOptionPane.showMessageDialog(null,"Seu resultado final é " + result);
            
         }else if (tipoPolinomial.equals("Segundo grau")) {
            int g = Integer.parseInt(JOptionPane.showInputDialog(null, " o A tem um multiplicador se sim , insira-o se não coloque 1"));
            int h = Integer.parseInt(JOptionPane.showInputDialog(null,"o x tem potenciador? se sim insira-o a seguir se nao coloque 1"));
            char i = JOptionPane.showInputDialog(null,"Insira o operador (+,-)").charAt(0);
            int j = Integer.parseInt(JOptionPane.showInputDialog(null,"o B tem um multiplicador se sim , insira-o se não coloque 1"));
            int k = Integer.parseInt(JOptionPane.showInputDialog(null,"O x2 tem potenciador ? se sim insira-o  se nao insira 1"));
            char l = JOptionPane.showInputDialog(null, "Insira o operador (+,-)").charAt(0);
            int m = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o c"));

            double resultTwo = 0.0;
            for(int y =0;y<subs.length-1;y++){
              double parcialTwo =  (identificador.polinomialSegundoGrau(g,i,j,l,m,subs[y],h,k)*somaRieman.deltaX);
            resultTwo = resultTwo + parcialTwo;
              // JOptionPane.showMessageDialog(null, "Dado o  subintervalo " + subs[y] +" o  resultado é "+ parcialTwo  );
           }
           JOptionPane.showMessageDialog(null,"Seu resultado final é " + resultTwo);
           
         }
    } else if (input.equals("Euler")) {
      double result = 0.0;
      double partialThree = 0.0;
        for(int var =0;var<subs.length-1;var++){
           partialThree = (identificador.euler(subs[var]));
           JOptionPane.showMessageDialog(null, "Dado o  subintervalo " + subs[var] +" o  resultado é "+ partialThree  );
            result = result + partialThree;
        }
         JOptionPane.showMessageDialog(null,"Seu resultado final é " + result);

    } else if (input.equals("Trigonometrica")) {
        String[] opçõesThree  = {"Seno" , "Cosseno" , "Tangente"};
         String tipoTrigonometrica = (String) JOptionPane.showInputDialog(null,"Selecione a opçaõ que deseja" , "Opções " , JOptionPane.QUESTION_MESSAGE,null,opçõesThree,opçõesThree[0]);
            double somaFour = 0.0;
            double somaFive = 0.0;
            double somaSix = 0.0;
         if (tipoTrigonometrica.equals("Seno")) {
          for(int one = 0;one<subs.length;one++){
            double parcialFour = Math.sin(subs[one]) * somaRieman.deltaX;
             somaFour = somaFour + parcialFour;
          }
           JOptionPane.showMessageDialog(null,"Seu resultado final é " + somaFour);

         }else if (tipoTrigonometrica.equals("Cosseno")) {
           for(int two = 0;two<subs.length;two++){
            double parcialFour = Math.cos(subs[two]) * somaRieman.deltaX;
             somaFive  = somaFive + parcialFour;
          }
           JOptionPane.showMessageDialog(null,"Seu resultado final é " + somaFive );
         }else if (tipoTrigonometrica.equals("Tangente")) {

           for(int three = 0;three<subs.length;three++){
            double parcialFour = Math.tan(subs[three]) * somaRieman.deltaX;
             somaSix = somaSix + parcialFour;
          }
           JOptionPane.showMessageDialog(null,"Seu resultado final é " + somaSix );
          
         }
     }


    }
}