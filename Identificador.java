public class Identificador {
    // Transformar String em funcões usaveis
    // Samuel

    private String funcao;
    private char[] array;

    public Identificador(String funcao) {
        this.funcao = funcao;
        
    }
    public void transformarArray(){
        int i; 
        int tam = this.funcao.length();
        for(i=0;i<tam;i++){
            array[i] = this.funcao.charAt(i);
        }
    }
}
