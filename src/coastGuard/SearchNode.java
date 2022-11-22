package coastGuard;

public class SearchNode {
	State state;
	SearchNode parent;
	Operation operation;
	int depth;
	int pathCost;
	
	public SearchNode(State state, SearchNode parent, Operation operation, int depth, int pathCost) {
		this.state = state;
		this.parent = parent;
		this.operation = operation;
		this.depth = depth;
		this.pathCost = pathCost;
	}
	

}
