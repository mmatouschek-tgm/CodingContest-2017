package nodes_hashing;

public class Node {

	
	public String nodeId;
	public int hashRate;
	
	public Node(String nodeId, int hashRate) {
		this.nodeId = nodeId;
		this.hashRate = hashRate;
	}
	
	public static void main (String[] args) {
		Node n = new Node("N1", 123);
		System.out.println(""+n.nodeId+" "+n.hashRate);
	}
	
	public int getHashRate() {
		return this.hashRate;
	}
}
