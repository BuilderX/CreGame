package NoSe;

public class QdT {

	
	
	public static void main() {
				GameObject obj = new GameObject(6);
				Circle c = new Circle(0) ;
		
				QTree tree = new QTree(1000, 2000);
		
				QTreeNode node1 = new QTreeNode (23, 23, 2, 1);
				 node1.insertObject(obj, c);
		
	} 
	
}
