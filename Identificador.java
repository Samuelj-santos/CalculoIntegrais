public class Identificador {
    // Transformar String em funcões que possam ser usadas
    // Samuel

    private String funcao;
    private char[] array;

    public Identificador(String funcao) {
        this.funcao = funcao;
        
    }
    public void transformarArray(){
        
        int tam = this.funcao.length();
        for(int i=0;i<tam;i++){
            array[i] = this.funcao.charAt(i);
        }
    }

    public void transformarEquacao(){
        //nomenclaturas:
        //E = numero de Euler;
        //P = pi;
        //
        String b ="";
        String c = "";
        for(int i =0;i<this.funcao.length();i++){
          if (array[i] == '1'||array[i] == '2'||array[i] == '3'||array[i] == '4'||array[i] == '5'||array[i] == '6'||array[i] == '7'||array[i] == '8'||array[i] == '9'||array[i] == '0') {
            char a =array[i];
              b = b+a;
          
        }}

    }
    public void stringTOint(){

    }
}
