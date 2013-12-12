package p;

public class HeapSort {

	
	private int[] a;
	private int N;
	
	public HeapSort(int size)
	{
		N = -1;
		a = new int[size];
		for (int i = 0; i<a.length; i++)
		{
			a[i] = -1;
		}
	}
	
	public  void PlaceItemAtPosition()
	{
		int temp = N;
		int parent = getParent(temp);
		while(a[temp] > a[parent] && temp >=0 && parent >= 0)
		{
			exchange(temp, parent);
			
			temp = parent;
			parent = getParent(temp);
		}
	}
	private  void exchange(int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	private int getParent(int n)
	{
		int parent = 0;
		if (n == 0)
			parent = 0;
		else if (n%2 == 0)
			parent = n/2 -1;
		else
			parent = n/2;
		return parent;
	}
	public  void addItemToHeap(int info)
	{
		N++;
		a[N] = info;
		PlaceItemAtPosition();
	}
	public void adjustAfterDelete()
	{
		int i =0;
		
		while((2*i <= N) && !(a[i] > a[2*i+1] || a[i] > a[2*i +2]))
		{
			int maxTemp = (a[2*i+1] <a[2*i+2]) ? 2*i+1 : 2*i+2;
			
			exchange(i,  maxTemp);
			
			i = maxTemp;
		}
	}
	
	
	public  int GetMaxItem()
	{
		int itemToReturn = -1;
		itemToReturn = a[0];
		
		exchange(0, N);
		a[N] = -1;
		N = N-1;
		
		adjustAfterDelete();
			
		return itemToReturn;
	}
	
	public void displayList()
	{
		System.out.println("List:");
		for (int i = 0; i <a.length; i++)
		{
			System.out.println("\t"+a[i]);
		}
	}
	
	public void displaySortedList()
	{
		System.out.println("Sorted List:");
		while(N>=0)
			System.out.println("\t"+GetMaxItem());
	}
	public static void main(String[] args)
	{
		HeapSort hs;		
		hs = new HeapSort(10);		
		int a[] = {3, 9, 4, 1, 5, 2, 7, 8, 6, 10};

		for(int i = 0; i<a.length; i++)
		{			
			hs.addItemToHeap(a[i]);
		}
		
		hs.displayList();
		
		hs.displaySortedList();
	}

}
