package tp01luciano;



/**
 *
 * @author Administrador
 */
public class Calculadora {

    Integer numEnt1 = 0;
    Integer numEnt2 = 0;
    Double numDou1 = 0.;
    Double numDou2 = 0.;
    
    
    
    public void calculoEntero(Integer num1, Integer num2, String operador){
        numEnt1 = num1;
        numEnt2 = num2;
        String ope = operador;
        if("+".equals(ope)){
                Integer result = num1+num2;
                System.out.println(numEnt1+" + "+numEnt2+" = "+result);
        }
        else if("-".equals(ope)){
                Integer result = num1-num2;
                System.out.println(numEnt1+" - "+numEnt2+" = "+result);
        }
        else if("*".equals(ope)){
                Integer result = num1*num2;
                System.out.println(numEnt1+" * "+numEnt2+" = "+result);
        }
        else{
                Integer result = num1/num2;
                System.out.println(numEnt1+" / "+numEnt2+" = "+result);
        
        }
    }
    
    public void calculoDecimal(Double num1, Double num2, String operador){
        numDou1 = num1;
        numDou2 = num2;
        String ope = operador;
        if("+".equals(ope)){
                Double result = num1+num2;
                System.out.println(numEnt1+" + "+numEnt2+" = "+result);
        }
        else if("-".equals(ope)){
                Double result = num1-num2;
                System.out.println(numEnt1+" - "+numEnt2+" = "+result);
        }
        else if("*".equals(ope)){
                Double result = num1*num2;
                System.out.println(numEnt1+" * "+numEnt2+" = "+result);
        }
        else{
                Double result = num1/num2;
                System.out.println(numEnt1+" / "+numEnt2+" = "+result);
        
        }
    }
    
        
    
    
    
    }
        
        
    
    
    
