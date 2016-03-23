import java.util.LinkedList;


public class HoldData extends AdditionalStats{

				HoldData(Velocity v){
						LinkedList<Velocity> list = new LinkedList<Velocity>();
						
						list.add(v);
						System.out.println(list);		
						   if(list.size() >=40 || list.isEmpty() ) {
							   	System.out.println(list);
							   	LinkedList clone = (LinkedList) list.clone();
							   		clone = new LinkedList();
							   	System.out.println(clone);

						   }
						
				} public void push() {
					
					
				}
				public static void main (String [] arg) {
						
					boolean issued = false;
					int age = 0;
					boolean OldEnoughForID = age >=18;
					boolean NotOldEnoughtForID = age < 18;
					int ageList[] = new int[9];
						 for (int i = 0; i < ageList.length; i++) {
							 ageList[i] = age + 5/2;	
							 System.out.println(ageList[i]);
							if(ageList[i] ==2) {
								System.out.println("Age  : " + i);
								while( ageList[i] ==2) {
									issued = false;
									 Snake snake= new Snake();
									 
									
								}
							} 
							 
	
					}}
			 }