package modelo;
public class TesteCalc{
    public static void main(String[]args){
        Calculadora c1 = new Calculadora();
        try{
            System.out.println(c1.somar(2,3));
            
            System.out.println(c1.dividir(6,3));
            
            System.out.println(c1.dividir(6,0));
        }catch(ErroCalc e){
            System.out.print(e.getMessage());
        }
    }           
}//fecha class 