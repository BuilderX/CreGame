package NoSe;

public class Vector {
			public final float vec[];
			
					Vector(){
						// vector with three positions
							vec = new float[3];
			
						
							
					}
					
					// constructor that delares to each position
					
			public  Vector(final float x, final float y, final float z) {
				vec = new float[3];
				vec[0] = x;
				vec[1] = y;
				vec[2] = z;
				
			}
	
	
	public void set(final Vector position) {
		// loops through each position in the vec array
		for (int i = 0; i < 3; i++) {
			vec[i] = position.vec[i];
			
		}
	}

}
