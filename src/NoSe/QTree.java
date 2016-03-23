package NoSe;

public class QTree {
	// node quad trees 
		private final QTreeNode node;
	
		// define a quad tree extend as width and height
		public QTree(final float worldExtends, int worldDepth) {
			node = new QTreeNode(0,0, worldExtends, worldDepth);
		}
		
		//insert a game object at the quad tree
		public void insertObject(final GameObject obj) {
			node.insertObject(obj,obj.circleCollider);
			
		
		}
		public void insertString(final String name) {
		
			
		}
		
		//clean tree
		public void clean() {
			node.clean();}
}
