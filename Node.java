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

	void removeNode(int d){
		Node n = this;
		while(n.next != null){
			if(n.next.data == d){
				n.next = n.next.next;
				return;
			}
			n = n.next;
		}
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
		n.appendToTail(31);
		n.appendToTail(43);
		n.printLinkedList();
		n.removeNode(31);
	}
}

