import java.util.Scanner;


public class Velocity {
				
				int  t = 0;
				int height;
				int seconds;
				
					Velocity(){
						int DataSet[] = new int [5];
						Scanner scan = new Scanner(System.in);
						for (int i = 0; i < DataSet.length; i++) {
							DataSet[i] = scan.nextInt();
							System.out.println(i + "  "+ DataSet[i]);
						} for (int Set : DataSet) {
							System.out.println( "" +Set);
						}
					
						
							System.out.println(" ");
						
						
					}
					public Velocity(int t, int height, int seconds) {
						super();
						this.t = t;
						this.height = height;
						this.seconds = seconds;
						t = t *= 2;
						
					}
					public int getT() {
						return t;
					}
					public void setT(int t) {
						this.t = t;
					}
					public int getHeight() {
						return height;
					}
					public void setHeight(int height) {
						this.height = height;
					}
					public int getSeconds() {
						return seconds;
					}
					public void setSeconds(int seconds) {
						this.seconds = seconds;
					}
					@Override
					public String toString() {
						return "Velocity [t=" + t + ", height=" + height
								+ ", seconds=" + seconds + "]";
					}
}
