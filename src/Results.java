import java.io.DataInputStream;



public class Results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					Velocity set = new Velocity(2,400,16);
					
					int height =set.getHeight();
					int seconds = set.getSeconds();
					int t =set.getT();
					int sum = height - seconds * t ;
					System.out.println(sum);
					System.out.println(set.toString());
					
					HoldData dataSet1 = new HoldData(set);
					HoldData dataSet2 = new HoldData(new Velocity(3,4,7));
					
	}

}
