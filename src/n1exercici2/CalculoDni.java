package n1exercici2;

public class CalculoDni {
    private int numeroDNI;
    private final char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
   
    public CalculoDni(){
        numeroDNI = 0;
    }
    public CalculoDni(int num){
        this.numeroDNI = num;
    }
    public void setNumeroDNI(int nuevoNum){
        this.numeroDNI = nuevoNum;
    }
    public int getNumeroDNI(){
        return numeroDNI;
    }
    public char obtenerLetra(){
        int resto;
        int letra;
        resto = numeroDNI % 23;
        System.out.println("DNI COMPLETO: "+numeroDNI+letras[resto]);
        return (char) (letra = letras[resto]);
        //return letra = letras[resto];
    }
}