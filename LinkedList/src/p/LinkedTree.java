package p;

public class LinkedTree {
	
	private Node headNode;
	
	public LinkedTree() {
		// TODO Auto-generated constructor stub
		headNode = null;
	}
		
	public void addNodeAtBeginning(int info)
	{
		Node newNode = new Node();
		newNode.SetValue(info);
		newNode.SetNextAddress(headNode);
		
		headNode = newNode;
		
	}
	
	public void addNodeAtEnd(int info)
	{
		Node newNode = new Node();
		newNode.SetValue(info);
		newNode.SetNextAddress(null);
		
		Node tempNode = headNode;
		if (tempNode == null)
		{
			headNode = newNode;
		}
		else
		{
			while(tempNode.getNextAddress() != null)
			{
				tempNode = tempNode.getNextAddress();
			}
			tempNode.SetNextAddress(newNode);
		}
	}
	
	public void displayTree()
	{
		Node tempNode = headNode;
		System.out.println("List of Values added:");
		while(tempNode != null)
		{
			System.out.print("\t"+tempNode.getValue());
			tempNode = tempNode.getNextAddress();
		}
	}
	
	public static void main(String args[])
	{
			
		
		LinkedTree lt = new LinkedTree();
		
		int a[] = {2, 4, 3, 6, 8, 9, 4, 5, 1, 7};
		
		for (int i = 0; i<a.length; i++)
		{
			//lt.addNodeAtBeginning(a[i]);
			lt.addNodeAtEnd(a[i]);
		}
		
		lt.displayTree();
	}

}
