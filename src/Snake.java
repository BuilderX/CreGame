import java.util.LinkedList;


public class Snake  implements call{
				int hp;
				int attack;
				int [] slots;
				int speed;
				String latentAbilities[];
				LinkedList<Snake> list;	
				LinkedList<Snake> ListInList;
				Snake s;
	
	public Snake(int hp, int attack, int[] slots, int speed,
			String[] latentAbilities) {
					super();
					this.hp = hp;
					this.attack = attack;
					this.slots = slots;
					this.speed = speed;
					this.latentAbilities = latentAbilities;
				}
	Snake(){
		hp = 100;
		attack = 20;
		slots = new int [4 + 5];
		speed = 60;
		latentAbilities = new String[4];
		latentAbilities[0] = "Ray";
		latentAbilities[1] = "Joe";
		latentAbilities[2] = "Bill";
		latentAbilities[3] = "Kim";
		
		System.out.println("Health : "+ hp +"Attack : "+ attack + " Slots :"  + slots +
				"Speed : "+ speed);
		
		for (String x : latentAbilities) {
			System.out.println(x);
		}
		
	}
	Snake(int slots, String entry ){		
			latentAbilities = new String [slots];
			for (int i = 0; i < latentAbilities.length; i++) {
				hp=hp += 3;
				speed = speed + 5;
				latentAbilities[i] = entry;
				System.out.println(latentAbilities);
			}
			Snake sn = new Snake(s,true);
			ListInList = new LinkedList<Snake>();
			ListInList.add(sn);
			
	}
	Snake( Snake snake, boolean proceed){
		proceed = true;
		list = new LinkedList<Snake>();
		
		
		if(proceed = true) {
		while(list.isEmpty()) {
		list.add(snake);
		System.out.println(list.toString());
		
		}if(list.indexOf(list) == 5) {
			list.getLast();
			System.out.print(list);
			
			
		}
}
		
	}
	
	
	public int getHp() {
		return hp;
	}



	public void setHp(int hp) {
		this.hp = hp;
	}



	public int getAttack() {
		return attack;
	}



	public void setAttack(int attack) {
		this.attack = attack;
	}



	public int[] getSlots() {
		return slots;
	}



	public void setSlots(int[] slots) {
		this.slots = slots;
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public 	String[] getLatentAbilities() {
		return latentAbilities;
	}



	public void setLatentAbilities(	String[] latentAbilities) {
		this.latentAbilities = latentAbilities;
	}



	@Override
	
	public int shed() {
		int hp =getHp();
		int speed =getSpeed();
		int shedEffects = hp + speed;
		System.out.println("Shed Effect : "+shedEffects +" Hp : " +  hp + "Speed : "+  speed);
		
		
		return shedEffects;
	}

	@Override
	public int one() {
		setHp(4);
		setSpeed(4);
		setLatentAbilities(latentAbilities);
		
		return 7;
	}

	@Override
	public int swim() {
		// TODO Auto-generated method stub
		return 10;
	}

}
