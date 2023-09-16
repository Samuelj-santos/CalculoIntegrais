import  javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        //Main provisoria
        int resposta =JOptionPane.showConfirmDialog(null,"Escolha uma opção:");
        if(resposta == 0){
            JOptionPane.showMessageDialog(null,"Você escolheu sim");
        }
        else{
            JOptionPane.showMessageDialog(null, "Você não escolheu sim");
        }
    }
}