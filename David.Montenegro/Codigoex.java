public class Codigoex{
    public static void main (String[] args){
        int altura = 8;
        int dia = 1;
        int horas = 1;
        while ( dia < 4 ){
            double pr = Math.random();
            double pap = Math.random();
            System.out.println("Dia : " + dia );
            int averiaR = 0 ;
            int averiaP = 0 ;
            int columnas = 1 ;
            int pisos = 1 ;
            while (horas < 25){
                System.out.println("Hora : " + horas );
                for ( int pisos = 1 ; pisos < altura ; pisos = pisos + 1){
                    System.out.print( 8 - columnas);
                    if (pr <= 0.25){
                        
                    }
                    for (columnas <= 5 ; columnas = columnas + 1 ){
                        double pva = Math.random();
                        double ple = Math.random();
                        if (pva <= 0.30){
                            System.out.print("[#]");
                        } else if ( pva > 0.30 && ple <= 0.40){
                            System.out.print("[.]");
                        } else if (pva > 0.30 && ple > 0.40){
                            System.out.print("[0]");
                        }
                    }
                    System.out.println();
                }
                horas = horas + 1 ;
                System.out.println("---------------------------");
            }
            dia = dia + 1;
            horas = 1 ;
        }
    }
}