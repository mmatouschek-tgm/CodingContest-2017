package nodes_hashing;

import java.util.ArrayList;
import java.util.Scanner;

public class Pool {
	ArrayList<Node> p;
	 
	int identiefier;
	 
	public Pool(int identifier){
		this.identiefier = identifier;
		ArrayList<Node> p = new ArrayList<Node>();
	}
	
	public int getHashrateSum() {
		int sum = 0;
		
		for(Node abc: p) {
			sum += abc.hashRate;
		}
		
		return sum;
	}
	
	static Node stringToNode(String input) {
		
		String[] asd = input.split(":");
		
		String id = asd[0];
		int hashrate = Integer.parseInt(asd[1]);
		
		return new Node(id, hashrate);
	}
	
	public static void main(String[] args) {
		
		Pool a = new Pool(1);
		
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		String[] inputs = text.split("$");
		String[] input = new String[inputs.length-1];
		
		int anzNodes = Integer.parseInt(inputs[0]);
		
		for(int i = 0; i < inputs.length-1; i++) {
			input[i] = inputs[i+1];
		}
		
		for (int i = 0; i < input.length; i++) {
			a.p.add(Pool.stringToNode(input[i]));
		}
		
		
		for (int i = 0; i < anzNodes; i++) {
			String identifier = s.nextLine();
			int hashRate = s.nextInt();
			a.p.add(new Node(identifier, hashRate));
			
		}
	}
}