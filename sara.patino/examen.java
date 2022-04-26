import java.lang.Math;

class examen{
    public static void main(String[] args) {

        int dia, hora;
        double  probabilidadVentana, probabilidadLuz, probabilidadAveria, probabilidadRayo;
        boolean ventanaAbierta, luzEncendida;

        dia = 1;
        while(dia <= 3 ) {

         

            // for (int y = 1; y<=7; y++){ 
            //     probabilidadAveria = Math.random();

            //     if(probabilidadAveria >= 0.85 && pisoEstropeado == 0){
            //         pisoEstropeado = y;
            //     }
            // }

            // for (int x = 1; x<=5; x++){ 
            //     probabilidadRayo = Math.random();

            //     if(probabilidadRayo >= 0.75 && columnaEstropeada == 0){
            //         columnaEstropeada = x;
            //     }
            // }

            for(hora = 1; hora <= 24; hora++){
                System.out.println("Hora " + hora + " del dia " + dia);
                for(int i = 7; i>0; i--){
                    System.out.print(i);
                    for(int j = 1; j<=5; j++){
                        probabilidadVentana = Math.random();
                        probabilidadLuz = Math.random();
                        ventanaAbierta = probabilidadVentana > 0.7 ? false: true;
                        luzEncendida = probabilidadLuz > 0.6 ? false: true;
                        
                        if(ventanaAbierta){
                            if(luzEncendida){
                                System.out.print(" [O] ");
                            }
                            else{
                                System.out.print(" [.] ");
                            }
                        }
                        else{
                            System.out.print(" [#] ");
                        }
                    }
                    System.out.println(); 
                }
    
            }
            dia++;
        }
        
    }
}