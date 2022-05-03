import java.lang.Math;

class examen{
    public static void main(String[] args) {

        int columnaMuerta, dias, horas, losPisos, departamentos;
        boolean rayo;

        for(dias=1; dias<=3; dias++){
            columnaMuerta=0;
            rayo = false;
                for(horas=0; horas<=23; horas++){
                    if((Math.random()*100)<=25 && !rayo){
                        rayo=true;
                        columnaMuerta= (int)(Math.random()*5+1);
                        System.out.println("Cae un rayo");
                    }

                    System.out.println("Dia " + dias+ " Hora " + horas);
                    for(losPisos=1; losPisos<=7 ;losPisos++){
                        for(departamentos=5;departamentos<=1;departamentos--){
                            if(rayo && departamentos==columnaMuerta){
                                System.out.println("[R]");
                            }else{
                                if((Math.random()*100)<=70){
                                    if((Math.random()*100)<=60){
                                        System.out.println("[0]");
                                    }else{
                                        System.out.println("[.]");
                                        }
                                    }else{
                                        System.out.println("[#]");
                                }
                            }
                        }
                    }
                }
            }
        }
    }