package NoSe;

public class Circle {
			public float radius;
			public final Vector center;
			public Circle(final float radius) {
				super();
				this.radius = radius;
		      	this.center = new Vector();
			}
			public void update(final Vector position) {
				center.set(position);
			
			
			}
			
			
			
			
}
