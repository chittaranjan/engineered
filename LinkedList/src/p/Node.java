package p;

public class Node {
	
	private int info;
	private Node nextAddress;
	
	
	public Node getNextAddress()
	{
		return nextAddress;
	}
	public int getValue()
	{
		return info;
	}
	
	public void SetValue(int info)
	{
		this.info = info;
	}
	
	public void SetNextAddress(Node nextAddress)
	{
		this.nextAddress = nextAddress;
	}
	
}
