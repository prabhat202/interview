package interview;

public class MinimumCostTree {
	private static final int V = 4;

	int minKey(int key[], Boolean mstSet[]) {
		int min = Integer.MAX_VALUE, min_index = -1;
		for (int v = 0; v < V; v++)
			if (mstSet[v] == false && key[v] < min) {
				min = key[v];
				min_index = v;
			}
		return min_index;
	}

	void printMST(int parent[], int graph[][]) {
		System.out.println("Edge \tWeight");
		for (int i = 1; i < V; i++)
			System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
	}

	void primMST(int graph[][]) {
		int parent[] = new int[V];
		int key[] = new int[V];

		Boolean mstSet[] = new Boolean[V];

		for (int i = 0; i < V; i++) {
			key[i] = Integer.MAX_VALUE;
			mstSet[i] = false;
		}
		
		key[0] = 0;
		parent[0] = -1;

		// The MST will have V vertices
		for (int count = 0; count < V - 1; count++) {

			int u = minKey(key, mstSet);
			mstSet[u] = true;
			
			for (int v = 0; v < V; v++)
				if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
					parent[v] = u;
					key[v] = graph[u][v];
				}
		}

		// Print the constructed MST
		printMST(parent, graph);
	}

	public static void main(String[] args) {
		MinimumCostTree costTree = new MinimumCostTree();
		int graph[][] = new int[][] { { 0, 1, 2, 3 }, { 1, 0, 3, 6 }, { 2, 3, 0, 1 }, { 3, 6, 1, 0} };

		costTree.primMST(graph);
	}

}
