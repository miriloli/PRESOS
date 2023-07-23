public class Utils {

    public static Regimen parseRegimen(String regimenInicial) { /*
                                                                 * sirve para poder meter un tipo que no existe en Java
                                                                 * en un Scanner
                                                                 */

        Regimen regimen = null;
        switch (regimenInicial) {
            case "preventivo":
                regimen = Regimen.PREVENTIVO;
                break;

            case "baja peligrosidad":
                regimen = Regimen.BAJA_PELIGROSIDAD;
                break;

            case "máxima seguridad":
                regimen = Regimen.MAXIMA_SEGURIDAD;
                break;

        }
        return regimen;

    }

    public static String regimenToString(Regimen regimen) {

        String regimenString = "";

        switch (regimen) {

            case PREVENTIVO:
                regimenString = "preventivo";
                break;
            case BAJA_PELIGROSIDAD:
                regimenString = "Baja peligrosidad";
                break;
            case MAXIMA_SEGURIDAD:
                regimenString = "Máxima seguridad";
                break;

        }

        return regimenString;
    }

}
