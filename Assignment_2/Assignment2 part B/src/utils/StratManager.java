package utils;

public class StratManager{
	private StoreStrategy strat;
	StratManager(int n){
		switch(n) {
		case 1:
			strat = new TableStrat();
			break;
		case 2:
			strat = new DocumentStrat();
			break;
		case 3:
			strat = new NodeStrat();
			break;		
		}
		
	}
	public void store() {
		strat.store();
	}
	public void setStrategy(int n) {
		switch(n) {
		case 1:
			strat = new TableStrat();
			break;
		case 2:
			strat = new DocumentStrat();
			break;
		case 3:
			strat = new NodeStrat();
			break;		
		}
	}
}