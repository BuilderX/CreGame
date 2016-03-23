package NoSe;

public class Minions {
				int val;
			 Minions next;
			 Minions [] neightbor;
			 boolean visited;
			public Minions(int x,Minions[] n) {
				super();
				this.val = x;
				this.neightbor = n;
			}
			public Minions (int x ) {
				val = x;
				
				
			}
			
			
			public int getVal() {
				return val;
			}
			public void setVal(int val) {
				this.val = val;
			}
			public Minions getNext() {
				return next;
			}
			public void setNext(Minions next) {
				this.next = next;
			}
			public Minions[] getNeightbor() {
				return neightbor;
			}
			public void setNeightbor(Minions[] neightbor) {
				this.neightbor = neightbor;
			}
			public boolean isVisited() {
				return visited;
			}
			public void setVisited(boolean visited) {
				this.visited = visited;
			}
			@Override
			public String toString() {
				return "Minions [val=" + val + "]";
			}
			 		
}
