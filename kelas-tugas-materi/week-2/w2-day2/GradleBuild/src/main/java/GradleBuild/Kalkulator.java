package GradleBuild;
 
/**
 * Ini untuk melakukan unit test dengan JUnit.
 * @author awanlabs
 */
public class Kalkulator {
    
    public double kali(double operandA,double operandB){
        return operandA*operandB;
    }
    
    public double bagi(double operandA,double operandB){
        return operandA/operandB;
    }
    
    public double tambah(double operandA,double operandB){
        return operandA+operandB;
    }
    
    public double kurang(double operandA,double operandB){
        return operandA-operandB;
    }   

    public static void main(String[] args) {
        //Create Object
        Kalkulator hitung = new Kalkulator();
        // hitung.tambah(2, 3);
        // hitung.kurang(4, 2);
        System.out.println(hitung.kali(2, 3));
        System.out.println(hitung.bagi(2, 3));
        System.out.println(hitung.tambah(2, 3));
        System.out.println(hitung.kurang(2, 3));
    }
}