public class examen{
    public static void main(String[] args){

        double ventana, ventanaCerrada, ventanaAbierta;
        double luz, luzApagada, luzEncendida;
        int hora;

        hora=0;

        while(hora<=72){
            hora=hora+1;

        ventana=(Math.random()*(100-0))+0;
        if(ventana<=70){
            ventana=ventanaAbierta;
        }else{
            ventana=ventanaCerrada;
        }

        luz=(Math.random()*(100-0))+0;
        if(luz<=60){
            luz=luzEncendida;
        }else{
            luz=luzApagada;
        }

        for(int i=0;i<=6;i++){

        if((ventanaAbierta && luzEncendida)==i){
            System.out.print("[0]");
        }else if((ventanaCerrada)==i){
            System.out.print("[#]");
        }else if((ventanaAbierta && luzApagada)==i){
            System.out.print("[.]");
        }
    
        }

   
        }
    }
}