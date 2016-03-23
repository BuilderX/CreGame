package NoSe;

import java.util.ArrayList;

public class QTreeNode {
	// depth of the tree
		private final int currDepth;
		private final Vector center;
		private final QTreeNode[]nodes;
		
		// create's list of objects
		private final ArrayList<GameObject> objects;
		
		
		// set up a quad tree 
	public QTreeNode(float centerX,float centerY, float halfWidth, int stopDepth) {
		// set limit with curr depth = to stop depth
		this.currDepth = stopDepth;
		// set Vector to current xyz valyes/ create a vector  with default values 
		this.center = new Vector(centerX,centerY, 0.0f);
		// array is equal to a new array list populated by game objects
		this.objects = new ArrayList<GameObject>();
		// set to default value of 0
		float offsetX = 0.0f;
		float offsetY = 0.0f;
		
		// if the stopDepth is greater than 0 than if statement continues
		
		if (stopDepth > 0) {
			// create four child nodes as long as depth > 0
			this.nodes = new QTreeNode[4];
			// halves the child nodes size 
			float step = halfWidth * 0.5f;
			// loop through and create new child nodes
			for (int i = 0; i <4; i++) {
				// compute the offsets of the child nodes
				offsetX = (((i * 1)==0)? step : -step);
				offsetY = (((i * 2)==0)? step : -step);
				nodes[i] = new QTreeNode(centerX + offsetX, centerY + offsetY, step, stopDepth -1);
			}}else {
				this.nodes= null;}}
	

	public void insertObject(GameObject obj, Circle collider) {
		// get child node index as 0 initially 
		int index =0;
		boolean straddle = false; // set straddling to false 
		float delta; // get the raw arrays, makes it easier to run loop
		final float []objPos = collider.center.vec;
		final float [] nodePos = center.vec;
		for (int i = 0; i <2; i++) {// compute the felta, node pos vector index obke pos vector of delet
			delta = nodePos[i] - objPos[i]; // if absolutevect index is <= radius object break
			if (Math.abs(delta) <= collider.radius) {
				straddle = true; 
				break; // computer the index to insert to child
				}
				if (delta > 0.0f) { index |= (1 <<i);		}}			
				if (!straddle && currDepth > 0) {// not straddlng insert at indext
					nodes[index].insertObject(obj, collider);
				}else {
					// straddling insert to this Node
					objects.add(obj);
				}}
	
	

	public void clean() {
		objects.clear(); // cleans children if available
		if (currDepth > 0) {
			for (int i = 0; i < 4; i++) {
				nodes[i].clean();
			}
		}
		
	}

}
