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
       for(int i =0;i<this.array.length;i++){
        if (array[i] == 'c' && array[i+1]=='o' && array[i+2] =='s' ) {
          
        }
       }

    }

}
