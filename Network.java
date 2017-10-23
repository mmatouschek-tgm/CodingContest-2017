package nodes_hashing;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Network {
public static void main(String[] args) {
		
		Pool p1 = new Pool(1);
		Pool p2 = new Pool(2);
		Pool p3 = new Pool(3);
		
		ArrayList<Node> n = new ArrayList<Node>();
		
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		String[] inputs = text.split("$");
		String[] input = new String[inputs.length-1];
		
		int anzNodes = Integer.parseInt(inputs[0]);
		
		for(int i = 0; i < inputs.length-1; i++) {
			input[i] = inputs[i+1];
		}
		
		for (int i = 0; i < input.length; i++) {
			if(input[i].contains("P") == false) {
				n.add(Pool.stringToNode(input[i]));
			}
		}
		
		for (int i = 0; i < input.length; i++) {
			if(input[i].contains("P")) {
				n.add(Pool.stringToNode(input[i]));
			}
		}
		
		
		
		
		
		
		for (int i = 0; i < anzNodes; i++) {
			String identifier = s.nextLine();
			int hashRate = s.nextInt();
			p1.p.add(new Node(identifier, hashRate));
			
		}
	}
}

