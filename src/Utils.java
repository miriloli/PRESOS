public class Utils {

    public static Regimen parseRegimen(String pepe){

        Regimen regimen=null;
        switch(pepe){
            case "preventivo":
            regimen= Regimen.PREVENTIVO;
            break;

            case "baja peligrosidad":
            regimen= Regimen.BAJA_PELIGROSIDAD;
            break;

            case "máxima seguridad":
            regimen= Regimen.MAXIMA_SEGURIDAD;
            break;

        }
        return regimen;

    }


    
    
}
