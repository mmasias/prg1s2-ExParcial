import java.lang.Math;

class examen{
    public static void main(String[] args) {

        int dia, hora, ubicacionAveria;
        double  probabilidadVentana, probabilidadLuz, probabilidadAveria;
        boolean ventanaAbierta, luzEncendida;

        dia = 1;
        while(dia <= 3 ) {


            // //Averia
            // probabilidadAveria = (Math.random()*(100-0))+0;

            // if(probabilidadAveria<=15){
            //     ubicacionAveria=(int)(Math.random()*7+1);

            // }

            // //CaidaRayo
            // int columnaRayo;

            // columnaRayo= (Math.random()*(100-0))+0;


            for(hora = 1; hora <= 24; hora++){
                System.out.println("Hora " + hora + " del dia " + dia);
                for(int i = 7; i>0; i--){
                    System.out.print(i);
                    for(int j = 1; j<=5; j++){
                        probabilidadVentana = (Math.random()*(100-0))+0;
                        probabilidadLuz = (Math.random()*(100-0))+0;
                        ventanaAbierta = probabilidadVentana > 70 ? false: true;
                        luzEncendida = probabilidadLuz > 60 ? false: true;
                        
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