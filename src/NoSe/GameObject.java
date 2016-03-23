package NoSe;

public class GameObject {
// the collider
		public final Circle circleCollider;
	// other Game Object specific data
		
		public GameObject(final float radius) {
			super();
			// collider = new curcle obkect 
			circleCollider = new Circle(radius);
		}
		
		
}
