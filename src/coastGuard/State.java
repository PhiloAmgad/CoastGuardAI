package coastGuard;

public class State {

	String grid;
	int deathCount;
	int rescuedCount;
	int remainingCount;
	int collectedBBCount;
	//
	public State(String grid, int deathCount, int rescuedCount, int remainingCount, int collectedBBCount) {
		this.grid = grid;
		this.deathCount = deathCount;
		this.rescuedCount = rescuedCount;
		this.remainingCount = remainingCount;
		this.collectedBBCount = collectedBBCount;
	}
	

}
