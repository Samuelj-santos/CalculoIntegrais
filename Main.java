import  javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        //Main provisoria
       JOptionPane .showMessageDialog(null, "Bem vindo");
        JOptionPane.showMessageDialog(null,"Nomenclatura :" + "\nE = numero de Euler" + "\nP = pi " +"\n^ = potenciação  " +"\n+ =  para soma"+"\n- =  para subtração"+"\n/ =  para divisão " +"\n* =  para multiplicação" +"\n# = radiciação" +"\n log = logaritmo" + "\nln = lnx" + "\ncos = cosseno"+"\nsec = secante"+"\ntan = tangente" );
        String funcao = JOptionPane.showInputDialog("Qual a sua função");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o b"));
       


    }
}