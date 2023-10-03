import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
        String[] op = {"Calculo a esquerda","Calculo a direita"};
       double a = Double.parseDouble(JOptionPane.showInputDialog("Coloque o limite inferior: "));
       
        double b = Double.parseDouble(JOptionPane.showInputDialog("Coloque o limite superior: ")); 
        int n = Integer.parseInt(JOptionPane.showInputDialog("Coloque o numero de divisões"));
        Cal c = new Cal (a,b,n);
        int escolha = JOptionPane.showOptionDialog(
            null, // Componente pai (null para nenhum)
            "Escolha uma opção:", // Mensagem
            "Opções", // Título da caixa de diálogo
            JOptionPane.DEFAULT_OPTION, // Tipo de opções (padrão)
            JOptionPane.INFORMATION_MESSAGE, // Tipo de ícone
            null, // Ícone personalizado (não especificado neste exemplo)
            op, // Opções disponíveis
            op[0] // Opção padrão selecionada
        );
        if(escolha==0){
            c.calculoEsquerdo();
        }
        else{
            c.calculoDireito();
        }
    }
}