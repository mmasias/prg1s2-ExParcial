import java.lang.Math;

public class examen{
    public static void main(String[] args){

        double ventana, ventanaCerrada, ventanaAbierta;
        double luz, luzApagada, luzEncendida;
        int hora;

        ventana=[];
        ventanaCerrada=[*];
        

        hora=0;

        while(hora<=72){
            hora=hora+1;

        ventana=(Math.random()*(100-0))+0;
        if(ventana<=70){
            ventana=ventanaAbierta;
            ventanaAbierta=[0];
        }else{
            ventana=ventanaCerrada;
            ventanaCerrada=[#];
        }

        luz=(Math.random()*(100-0))+0;
        if(luz<=60){
            luz=luzEncendida;
            luzEncendida=[0]
        }else{
            luz=luzApagada;
            luzApagada=[.]
        }
    

        for(int i=1;i<=5;i++){
            for(int j=1;j<=7;j++){


            if(ventanaAbierta==i && ventanaAbierta==j && luzEncendida==i && luzEncendida==j ){
            System.out.println("[0]");
        }else if(ventanaCerrada==i && ventanaCerrada==j){
            System.out.println("[#]");
        }else if(ventanaAbierta==i &&ventanaAbierta==j && luzApagada==i && luzApagada==j){
            System.out.println("[.]");
        }

        
    
        }
    }

    }

   
        
    }

}