public class Node{
	Node next = null;
	int data;

	public Node(int d){
		data = d;
	}

	void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}

	void printLinkedList(){
		Node n = this;
		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args){
		Node n = new Node(69);
		n.appendToTail(125);
		n.printLinkedList();
	}
}

