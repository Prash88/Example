
public class LinkListSwap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(10,null);
		Node n2 = new Node(20,null);
		Node n3 = new Node(30,null);
		Node n4 = new Node(40,null);
		Node n5 = new Node(50,null);
		
		LinkedList l = new LinkedList(n1);
		l.addNode(n2);
		l.addNode(n3);
		l.addNode(n4);
		l.addNode(n5);
		l.printList();
		l.swapList(4);
		l.printList();
	}

}
class LinkedList
{
	Node head;
	public LinkedList(Node head)
	{
		this.head = head;
	}
	public void addNode(Node n)
	{
		Node traverse = head;
		while(traverse.next != null)
		{
			traverse = traverse.next;
		}
		traverse.next = n;
		n.next = null;
	}
	public void printList()
	{
		Node traverse = head;
		while(traverse != null)
		{
			System.out.println(traverse.data);
			traverse = traverse.next;
		}
	}
	public void swapList(int k)
	{
		int k1 = k-2;
		int k2 = countNodes()-k-1;
		if(k1 <= 0 || k2 <= 0)
			System.out.println("Negative k");
		Node traverse1 = head;
		Node traverse2 = head;
		
		while(k1!=0)
		{
			if(traverse1 != null)
			{
				traverse1 = traverse1.next;
				k1--;
			}
			else
			{
				System.out.println("Error in data");
			}
		}
		while(k2!=0)
		{
			if(traverse2 != null)
			{
				traverse2 = traverse2.next;
				k2--;
			}
			else
			{
				System.out.println("Error in data");
			}
		}
		
		Node swap = traverse1.next;
		traverse1.next = traverse2.next;
		Node swap1 =traverse1.next.next;
		traverse1.next.next = swap.next;
		traverse2.next = swap;
		traverse2.next.next = swap1;
	}
	public int countNodes()
	{
		int i = 0;
		Node traverse = head;
		
		while(traverse != null)
		{
			traverse = traverse.next;
			i++;
		}
		return i;
	}
	
	public LinkedList linkListMerge(LinkedList l)
	{
		Node traverse1 = this.head;
		Node traverse2 = l.head;
		while(traverse1 != null && traverse2 != null)
		{
			Node swap1 = traverse1.next;
			Node swap2 = traverse2.next;

			traverse2.next = swap1;
			traverse1.next = traverse2;
					
			traverse1 = traverse1.next.next;
			traverse2 = swap2;
		}
		return new LinkedList(traverse2);	
	}
}

class Node{
	int data;
	Node next;
	public Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
}
