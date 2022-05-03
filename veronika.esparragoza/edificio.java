import java.util.zip.ZipEntry;
public class edificio{
    public static void main(String[] args){
        boolean averiaRayo;
        boolean averiaPiso;
		int filaMuerta;
		int columnaMuerta;
		for(int days=1; days<=3; days++) {
			averiaRayo = false;
            averiaPiso = false;
			columnaMuerta = 0;
            filaMuerta = 0;
            System.out.println("Comienza un nuevo dia: " + days);
            System.out.println();
            System.out.println("-------------------------------");
			for(int hours=0; hours<=23; hours++) {
				if (Math.random() < 0.25 && !averiaRayo) {
					averiaRayo=true;
					columnaMuerta = (int) (Math.random()*5+1);
					}
                if (Math.random() < 0.15 && !averiaPiso) {
                    averiaPiso = true;
                    filaMuerta = (int) (Math.random()*7+1);
                    }
                System.out.println();
				System.out.println("Hora: "+hours + " del dia: "+days);
				for (int pisos=1; pisos<=7; pisos++){
					for (int flat=1; flat<=5; flat++) {
						if (averiaRayo && flat == columnaMuerta) {
							System.out.print(" [T] ");
						} else {
                            if(averiaPiso && pisos==filaMuerta){
                                System.out.print(" [P] ");
                            } else{
                                if (Math.random()<=0.7) {
                                    if (Math.random()<=0.6) {
                                        System.out.print(" [O] ");
                                    } else {
                                        System.out.print(" [.] ");
                                    }
                                } else {
                                    System.out.print(" [#] ");
                                }
                            }
						}
					}
					System.out.println();
				}
			}
            System.out.println("-------------------------------");
            System.out.println();
        }
    }
}
