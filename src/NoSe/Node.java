package NoSe;

import java.util.LinkedList;
import java.util.Scanner;

public class Node {
			int key;
			String Name;
			double pay;
			Node leftChild;
			Node rightChild;
			
			@Override
			public String toString() {
				return "     Node [ Key = " + key + " , Name = " + Name + " , = " + pay
						+ " ] ";
			}
			public Node(int key, String name, double pay) {
				super();
				this.key = key;
				Name = name;
				this.pay = pay;
			}
			public int getKey() {
				return key;
			}
			public void setKey(int key) {
				this.key = key;
			}
			public String getName() {
				return Name;
			}
			public void setName(String name) {
				Name = name;
			}
			public double getPay() {
				return pay;
			}
			public void setPay(double pay) {
				this.pay = pay;
			}
			
			
			
}class BinaryTree{
			Node root;
			
			public void addNode(int key, String name, double pay) {
				Node newNode = new Node(key, name, pay);
				
				if(root == null) {
					root  = newNode;
				}else {
					
					while(true) {
					
						Node focusNode = root;
						Node parent = focusNode;
					 
						if(key< focusNode.key) {
							
							focusNode= newNode.leftChild;
						}if (focusNode== null) {
							
							parent.leftChild = newNode;
							return;
							
						}else {
							focusNode = focusNode.rightChild;
							if(focusNode == null) {
								parent.rightChild = newNode;
								return;// all done
							}
						}
						
						
						
					}
					
				}
				
				
			}
						public boolean deleteNode(int key) {
							//start at the top of the node
							Node focusNode = root;
							Node parent = root;
							
							boolean isAleftChild = true;
							// while we habvent found the node
							
							while(focusNode.key != key) {
								 parent = focusNode;
								 
								 // if we should search to the left
								 if(key < focusNode.key) {
									 isAleftChild = true;
									 
									 focusNode = focusNode.leftChild;
								 }else{
									 isAleftChild = false;
									 // shift the focus Node to the left child 
									 focusNode = focusNode.rightChild;
									 
									 
								 }// if node wasn't found
								 if(focusNode == null) 
									 return false;
								 }
								if(focusNode.leftChild == null && focusNode.rightChild== null) {
									// if root delete it
									if(focusNode== root) 
										root = null;
									else if(isAleftChild) 
										parent.leftChild = null;
										
										else 
											parent.rightChild = null;
										
										
									}// if no right child
							else if(focusNode.rightChild == null) {
								if(focusNode == root)
									root = focusNode.leftChild;
								// if focus node was on the left of parent move focus nodes left child up to parent node	
								else if (isAleftChild)
									parent.leftChild = focusNode.leftChild;
									// vice bersa for the right child
								else 
										parent.rightChild = focusNode.rightChild;
									
								}// if no left child
								else if(focusNode.leftChild == null) {
									
									if(focusNode == root)
										root = focusNode.rightChild;
									// if focus Node was on the left of parent move focus nodes right child up to the parent node
									else if(isAleftChild)
										parent.leftChild = focusNode.rightChild;
									// vice versa for the left child
									else 
										parent.rightChild = focusNode.rightChild;
									
								}
								// two children so I need to find the deleted nodes replacement
								else {
									Node replacement = getReplacementNode(focusNode);
									// if the focusNode is root replace root with the replacement 
										if(focusNode== root)
											root = replacement;
										// if the deleted node was a left child make the replacement the left child
										else if(isAleftChild)
											parent.leftChild = replacement;
											// vice versa
										else parent.rightChild = replacement;
										replacement.leftChild = focusNode.leftChild;
										
										
								}
								return true;
								
						}
						private Node getReplacementNode(Node replacedNode) {
								Node replacementParent = replacedNode;
								Node replacement = replacedNode;
								
								Node focusNode = replacement.rightChild;
								// while there are no more left children
								
								while(focusNode != null) {
									replacementParent = replacement;
									replacement = focusNode;
									focusNode =focusNode.leftChild;
									
									
								}// if the replacement isnt't the right child move the replacement into the parents
								// left child slot and move the replaced nodes right child into the replacement rightchild
								if(replacement != replacedNode.rightChild) {
									replacementParent.leftChild = replacement.rightChild;
									replacement.rightChild = replacedNode.rightChild;
									
									
								}
								
							
							
							return replacement;
						}
							
						}
	class o{
				{
					Node newe = new Node(1, null, 35);
					Node left = newe.leftChild;
					Scanner input = new Scanner(System.in);
					int key = input.nextInt();
					String name = input.next();
					double pay = input.nextDouble();
					
					for (int i = 0; i < 6; i++) {
							System.out.println("Enter key | name | pay for employee : ");
								Node n = new Node(key,name,pay);
							// n = new Node(key, name, pay);
								String go = n.toString();
								System.out.println("Results " + go );
					}
					
				}
				class g {
					boolean AtWork = true;
					int x,y,z;
					Vector Set []  = new Vector[3];
					
					
					
					public g(boolean atWork, int x, int y, int z, Vector[] set) {
						super();
						AtWork = atWork;
						this.x = x;
						this.y = y;
						this.z = z;
						Set = set;
						Scanner input = new Scanner(System.in );
						
						for (int i = 0; i < set.length; i++) {
									
							x = input.nextInt();
							y = input.nextInt();
							z = input.nextInt();
							
							if (atWork) {
								atWork = true;
								int workersposition = (x + y + z)/ 2;
								System.out.println(workersposition);
							}else if(AtWork == false || x == 0 || y == 0 ){
								System.out.println( " x "+ x  +" y "+ y);
								
							
							
							}
							System.out.println( " X  = " +x +"Y = "+ y +"Z = " +  z);
							
						}
					}



					public boolean isAtWork() {
						return AtWork;
					}



					public void setAtWork(boolean atWork) {
						AtWork = atWork;
					}



					public int getX() {
						return x;
					}



					public void setX(int x) {
						this.x = x;
					}



					public int getY() {
						return y;
					}



					public void setY(int y) {
						this.y = y;
					}



					public int getZ() {
						return z;
					}



					public void setZ(int z) {
						this.z = z;
					}



					public Vector[] getSet() {
						return Set;
					}



					public void setSet(Vector[] set) {
						Set = set;
					}



					public g() {
						super();
						// TODO Auto-generated constructor stub
					}



					public void twist() {
						Node node = new Node(x, "Set One ", z);
						LinkedList<Node> list = new LinkedList<Node>();
						
						System.out.println(" Hash Code " +  " \n -------------- " +"\n" +node.hashCode());
						for (int i = 0; i < 4; i++) {
								list.add(node);
								for (Node node2 : list) {
									System.out.println(list);
									System.out.println(list.size());
								
								
								}
							BinaryTree t = new BinaryTree() ;
							Node n = new Node(x, " ", y);
							Node parent = new Node(x, " ", y);
							Node root = null ;
							
							Node newNode = new Node(x, "  ", y);
							while(true) {
								 
								if(root == null) {
									root = newNode;
									 if(2 <=n.key) {
										Node focusNode = newNode; 
									 if(focusNode == null)
									 { focusNode = newNode.leftChild;
									   System.out.println(focusNode.toString());
									   parent.leftChild = newNode;
									   System.out.println(focusNode.toString());
									   
									 } else {
										 focusNode = newNode.rightChild;
										 if(focusNode == null) {
											 parent.rightChild  = newNode;
											 	 
											 
											 
										 }
									 
									 }
									 }
								}
								
							}
							
							
						}
						
					}
				}
}
	