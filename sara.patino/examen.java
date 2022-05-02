import java.lang.Math;

class examen{
    public static void main(String[] args) {

        int dia, hora, ubicacionAveria;
        int  probabilidadVentana, probabilidadLuz, probabilidadAveria, probabilidadRayo;
        boolean ventanaAbierta, luzEncendida, caerRayo;
        String mensaje = " ";
        ubicacionAveria=0;
        caerRayo=false;
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
            probabilidadVentana = (int)(Math.random()*100);
            probabilidadLuz = (int)(Math.random()*100);
            probabilidadRayo = (int)(Math.random()*100);

            for(hora = 1; hora <= 24; hora++){

                System.out.println("Hora " + hora + " del dia " + dia + ": "+mensaje);


                if(probabilidadVentana <= 70){
                    ventanaAbierta=true;
                }
                if(probabilidadLuz <= 60){
                    luzEncendida=true;
                }
                if(probabilidadRayo <= 70 && !caerRayo){
                    caerRayo=true;
                    ubicacionAveria = (int)(Math.random()*5+1);
                    mensaje = "Cae un rayo";
                }

               
                for(int i = 0; i<=7; i++){
                    System.out.print(i);
                    for(int j = 1; j<=5; j++){
    
                        if(caerRayo=true && j==ubicacionAveria){
                            System.out.print(" [R] ");
                        } else {
                        if(ventanaAbierta=true){
                            if(luzEncendida=true){
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
                        
                    }
                    System.out.println(""); 
                }
                caerRayo=false;
            }
            dia++;
        }
        
    }
}