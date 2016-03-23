import java.util.HashMap;


public class Sheet {
			 double weight= 1.2343 ;
			 double data = 72.3243;
			 double range = 43.43;
			
			 
			public Sheet(double weight, double data, double range) {
				super();
				this.weight = weight;
				this.data = data;
				this.range = range;
				System.out.println("Weight" + weight + " Data"+ data +"Range" + range);
				
				HashMap ScanedRecords = new HashMap();
					
					for (int i = 0; i < 10; i++) {
					
				
					ScanedRecords.put( 0,0);
				}
			}
			public double getWeight() {
				return weight;
			}
			public void setWeight(double weight) {
				this.weight = weight;
			}
			public double getData() {
				return data;
			}
			public void setData(double data) {
				this.data = data;
			}
			public double getRange(double x1, double y1) {
				x1 = 0;y1 = 0;
				 double	ScanRANGE = x1/y1;
				 
				 ScanRANGE = ScanRANGE + getData() - getWeight();
				 	for(int i = 0;i<3;i++) {
					 	ScanRANGE = ScanRANGE + 2;
				 }
				 	
				 	System.out.println(ScanRANGE);
				 	return ScanRANGE;
			}
			public void setRange(double range) {
				this.range = range;
			}
			@Override
			public String toString() {
				return "Sheet [weight=" + weight + ", data=" + data
						+ ", range=" + range + "]";
			}
			 
			 
			 
				
}
