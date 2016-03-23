
public class Summon extends Creature {
				private static Player master;
				private SummonMode mode;
				private byte level;
				
				public static enum SummonMode{
					
					ATTACK(0),
					GUARD(1),
					STOREDATA(2),
					RELEASE(3);
					
					private int id;
					private byte level;
					private SummonMode mode;
					private SummonMode(int id) {
						this.id = id;
						
						
					} public int getID() {
						return id;
						
					}/* public Summon(int objID, CreatureController<? extends Creature> controller, SpawnTemplate spawnTemplate, 
							VisibleObjectTemplate objectTemplate, SummonStatsTemplate statsTemplate, byte level) {
							super(objID,controller,spawnTemplate,objectTemplate, new WorldPostition());
									controller.setOwner();
									this.level = level;
									super.setGameStats(new SummonGameStats(this,statsTemplate));
									super.setLifeStats(new SummonLifeStats(this));
									this.mode = SummonMode.GUARD;
					}*/
							public Player getMaster() {
								return master;
								
							}
					
				}
				
	
}
