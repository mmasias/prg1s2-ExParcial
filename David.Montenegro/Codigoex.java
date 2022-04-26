public class Codigoex{
    public static void main (String[] args){
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
            if (pr <= 0.25){
                averiaR = (int)(Math.random() * 5 + 1);
            }
            if (pap <= 0.25){
                averiaP = (int)(Math.random() * 7 + 1);
            }
            while (horas < 25){
                System.out.println("Hora : " + horas );
                while (pisos < 8){
                    System.out.print( 8 - pisos);
                    if (averiaP == pisos){
                        while(columnas < 6) {
                            System.out.print("[P]");
                            columnas = columnas + 1;
                        }
                    } else {
                        while(columnas < 6){
                            double pva = Math.random();
                            double ple = Math.random();
                            if (averiaR == columnas){
                                System.out.print("[R]");
                            } else if(pva <= 0.30){
                                System.out.print("[#]");
                            } else if ( pva > 0.30 && ple <= 0.40){
                                System.out.print("[.]");
                            } else if (pva > 0.30 && ple > 0.40){
                                System.out.print("[0]");
                            }
                            columnas = columnas + 1 ;
                        }
                    }
                    columnas = 1;
                    pisos = pisos + 1;
                    System.out.println();
                }
                pisos = 1;
                horas = horas + 1 ;
                System.out.println("---------------------------");
            }
            dia = dia + 1;
            horas = 1;
        }
    }
}