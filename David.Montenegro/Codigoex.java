public class Codigoex{
    public static void main (String[] args){
        int altura = 7;
        int dia = 0;
        int horas = 0;
        while ( dia < 3 ){
            double pr = Math.random() * 4 + 1;
            double pap = Math
            while (horas < 24){
                for ( int columnas = 1 ; columnas < altura ; columnas = columnas + 1){
                    for (int pisos = 1 ; pisos < 5 ; pisos = pisos + 1 ){
                        double pva = Math.random();
                        double ple = Math.random();
                        if (pva <= 0.30){
                            System.out.print("[#])");
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
        }
    }
}