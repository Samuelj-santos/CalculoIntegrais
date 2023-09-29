public class Identificador {
   

    public double polinomialPrimeiroGrau(int multiplicador , char operador , int segundoNumero , double x){
        double  result;
      if (operador == '+') {
        result = (multiplicador*x) + segundoNumero;
      }else{
       result = (multiplicador*x) - segundoNumero;
      }
      return result;
    }

    public double polinomialSegundoGrau(int multiplicador, char operador,int multiplicadorTwo,char operadortwo,int c , double x  , int potencia , int potenciaTwo){
        double result = 0;
        if (operador == '+' && operadortwo == '+') {
            result = (multiplicador*(Math.pow(x, potencia))) + (multiplicadorTwo*x) + c;

        }else if (operador == '+' && operadortwo == '-') {
              result = (multiplicador*(Math.pow(x, potencia))) + (multiplicadorTwo*(Math.pow(x, potenciaTwo))) - c;

        }else if (operador == '-' && operadortwo == '+') {
              result = (multiplicador*(Math.pow(x, potencia))) - (multiplicadorTwo*(Math.pow(x, potenciaTwo))) + c;

        }else if (operador == '-' && operadortwo == '-') {
              result = (multiplicador*(Math.pow(x, potencia))) - (multiplicadorTwo*(Math.pow(x, potenciaTwo))) - c;
        }

        return result;
    }
   

}
