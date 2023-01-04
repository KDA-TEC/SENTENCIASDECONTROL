package EJERCICIOS4;

public class EJERCICIOSWITCH {

    public static void main(String args[]){

        var estacion = "PRIMAVERA";

        switch(estacion){

            case "VERANO":
                System.out.println("Es Verano, hace calor");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño, hace frio");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno, hace frio");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera, hace calor");
                break;
        }

    }
}
