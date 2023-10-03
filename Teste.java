import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       Identificador identificador = new Identificador();
       System.out.println( "Qual a quantidade de subintervalos");
       int subIntervalos = s.nextInt();
        System.out.println("Insira o limite superior");//b
          int b = s.nextInt();
         System.out.println("Insira o limite inferior");// a 
         int a = s.nextInt();
          SomaRieman somaRieman = new SomaRieman(subIntervalos, b, a);
          double[] sub = somaRieman.inPole();
          System.out.println("Para calcular a sua funçaõ siga as instruções");
        
       while (s.hasNext()) {
        
          System.out.println("Qual o tipo da funçaõ ");
          System.out.println("1-  polinomial");
          System.out.println("2- Trigonometrica");
          System.out.println("3 - numero de euler");
          int c = s.nextInt();
          switch (c) {
            case 1:
                System.out.println("insira 1 se for do primeiro grau , ou 2 - se for do segundo grau");
                int d = s.nextInt();
                switch (d) {
                    case 1:
                        System.out.println("O x tem multiplicador ? se sim insira-o a seguir, se nao insira 1");
                        int e = s.nextInt();
                        System.out.println("Insira um operador(+,-)");
                        System.out.println("Se nao  tiver um outro numero a ser somado,  insira + e  na proxima instrução 1");
                        char f = s.next().charAt(0);
                        System.out.println("Insira o numero a ser somado");
                        int g = s.nextInt();
                        double result =0.0;
                        for(int i =0;i<sub.length;i++){
                            result = result + (identificador.polinomialPrimeiroGrau(e, f, g,sub[i] )*somaRieman.deltaX);
                        }
                        System.out.println("o resultado é" + result);
                       

                        break;
                        case 2:
                        System.out.println("  o A tem um multiplicador se sim , insira-o se não coloque 1");
                        int h = s.nextInt();
                        System.out.println("o x tem potenciador? se sim insira-o a seguir se nao coloque 1");
                        int l = s.nextInt();
                        System.out.println("Insira o operador (+,-)");
                        char i = s.next().charAt(0);
                        System.out.println("o B tem um multiplicador se sim , insira-o se não coloque 1");
                        int j = s.nextInt();
                        System.out.println("O x2 tem potenciador ? se sim insira-o  se nao insira 1");
                        int m = s.nextInt();
                        System.out.println("Insira o operador (+,-)");
                        char k = s.next().charAt(0);
                        System.out.println("Insira o c");
                        int t = s.nextInt();

                        double resultTwo =0.0;
                        for(int y =0;y<sub.length;y++){
                            resultTwo  = resultTwo + (identificador.polinomialSegundoGrau(h, i, j, k, t, sub[y], l, m)*somaRieman.deltaX);
                        }
                        System.out.println("O resultado é " + resultTwo);
                        break;  
                }

                break;
          
           case 2:

           break;
          }


       }
        
    }
}
