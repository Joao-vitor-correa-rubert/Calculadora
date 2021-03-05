package modelo;
import modelo.ErroCalc;

public class Calculadora {

  public int somar(int a, int b){

    return a+b;

  }


  public int dividir(int a, int b) throws ErroCalc {

    if(b==0)

      throw new ErroCalc(a, b);

    return a/b;

  }

}
