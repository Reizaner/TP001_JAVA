package tp01luciano;

/**
 *
 * @author Administrador
 */
public class Calendario {
    String[] dias = {"domingo","lunes","martes","miercoles","jueves","viernes","sabado"};
    Boolean estado = false;
    public Boolean isDiaSemana(String dia){
        for(int i = 0; i < dias.length; i++) {
            if(dias[i].equals(dia) == true) {
                estado = true;
        }          
        }
        return estado;
    }
        
            
    }

