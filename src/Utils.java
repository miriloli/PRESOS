import tipos.Regimen;

public class Utils {

    public static Regimen parseRegimen(String regimenStr){

        Regimen regimen=null;
        switch(regimenStr){
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

    public static String regimenToString(Regimen regimen){
        String regimenStr="";
        switch(regimen){
            case PREVENTIVO:
                regimenStr="preventivo";
                break;

            case BAJA_PELIGROSIDAD:
                regimenStr="baja peligrosidad";
                break;

            case MAXIMA_SEGURIDAD:
                regimenStr="máxima seguridad";
                break;
        }
        return regimenStr;
    }
    
    
}
