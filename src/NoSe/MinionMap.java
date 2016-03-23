package NoSe;

public class MinionMap {

	public static void main(String[] args) {
			Minions min1 = new Minions (1);
			Minions min2 = new Minions (2);
			Minions min3 = new Minions (3);
			Minions min4 = new Minions (4);
			Minions min5 = new Minions (5);
			Minions min6 = new Minions (6);
			Minions min7 = new Minions (7);
			Minions min8 = new Minions (8);
			Minions[] m,g;
			m = min1.neightbor = new Minions[]{min1, min3, min5,min6};
			g = min2.neightbor = new Minions[] {min4,min7,min8, min1};
			
			
			for (Minions minions : m) {
				System.out.println(minions);
				
			}
			
			
	}		
			public void search (Minions [] m, int key) {
				
					for (int i = 0; i < m.length; i++) {
						  if(key == m[i].val) {
							  System.out.println("Key Found " );
							  
							  
						  }else {
							  System.out.println("Value Not found ");
						  }
					}
				
				
			}

	

}
