
public class sena {

	public static void main(String[] args) {
		
		// 1.ÖDEV: 2 boyutlu içi random doldurulan bir matrisi küçükten büyüğe sıralayınız.
		
		int [][] dizi =new int [6][6];
		
		for (int i = 0; i< dizi.length ; i++){
			for (int j=0; j<dizi[i].length;j++) {
				dizi[i][j]= (int)(Math.random()*100);
			}		
		}			
		
		int temp;
			for(int i = 0; i<dizi.length; i++) {
				for(int j = 0; j<dizi[i].length-1; j++) {	
					for(int k=0; k<dizi[i].length-j-1 ; k++) {		
						if (dizi[i][k]>dizi[i][k+1]) {
							
						temp = dizi[i][k];
						dizi[i][k] = dizi[i][k+1];
						dizi[i][k+1]=temp;
				}
			}
		}
	}
			
			for (int i=0; i< dizi.length;i++){
				for(int j= 0; j< dizi[i].length; j++) {
					System.out.println(dizi[i][j] + "\t");
				}
				System.out.println("----------------------");
					System.out.println();
		}	

	}

}
