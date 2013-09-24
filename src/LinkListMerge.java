
public class LinkListMerge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Node n1 = new Node(10,null);
				Node n2 = new Node(20,null);
				Node n3 = new Node(30,null);
				Node n4 = new Node(40,null);
				
				Node n6 = new Node(60,null);
				Node n7 = new Node(70,null);
				Node n8 = new Node(80,null);
				
				LinkedList l1 = new LinkedList(n1);
				l1.addNode(n2);
				l1.addNode(n3);
				l1.addNode(n4);
				l1.printList();
				System.out.println();
				LinkedList l2 = new LinkedList(n6);
				l2.addNode(n7);
				l2.addNode(n8);
				l2.printList();
				
				System.out.println();

				l2 = l1.linkListMerge(l2);
				l1.printList();
				System.out.println();
				l2.printList();				
	}

}

