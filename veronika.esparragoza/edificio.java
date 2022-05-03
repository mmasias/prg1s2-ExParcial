import java.util.zip.ZipEntry;
public class edificio{
    public static void main(String[] args){

        boolean averiaRayo;
		int columnaMuerta;
		for(int days=1; days<=3; days++) {
			averiaRayo=false;
			columnaMuerta=0;
			for(int hours=0; hours<=23; hours++) {
				if (Math.random()<.5 && !caeRayo) {
					averiaRayo=true;
					columnaMuerta = (int) (Math.random()*5+1);
					}
				System.out.println("DIA "+days + " HORA "+hours);
				for (int pisos=1; pisos<=7; pisos++){
					for (int flat=1; flat<=5; flat++) {
						if (averiaRayo && flat==columnaMuerta) {
							System.out.print(" [T] ");
						} else {
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
					System.out.println("");
				}
			}
		}
    }
}
