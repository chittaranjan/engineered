package p;

import java.io.Console;

interface BaseInterface
{
	public void testInterface();
}
abstract class Base
{
	public abstract void getTest();
	public abstract void test();
}

public class QuikSort {

	public void selectionSort(int[] a)
	{
		for(int i=0; i<a.length-1; i++)
		{
			int min = i;
			for (int j = i+1; j<a.length; j++)
			{
				if (a[j]<a[min])
					min = j;
			}
			exchange(a, i, min);
			
		}
	}
	public  void quickSort(int[] a, int p, int r)
	{
		if(p<r)
		{
			int q=partition(a,p,r);
			quickSort(a,p,q-1);
			quickSort(a,q+1,r);
		}
	}

	private  int partition(int[] a, int p, int r) {

		int partition = a[p];
		
		int i = p;
		int j = r;
		
		while (true)
		{
			
			while(i<r && a[i]<partition)
				i++;
			
			
			while(j>p && a[j] >partition)
				j--;
			
			if (i<j)
				exchange(a, i, j);
			else
				return j;
		}
	}
	public void exchange(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void showList(int[] a)
	{
		for (int i =0; i<a.length; i++)
			System.out.print("\t"+ a[i]);
	}
	public static void main(String[] args)
	{
		Console c = System.console();
		
		System.out.println("Text Entered:"+c.readLine());
		int[] a = {12, 10, 13, 9, 34, 85, 1, 54, 43, 90, 78, 69, 25}; 
		int lo = 0;
		int hi= a.length;

		System.out.println("List Before Sort:"+System.currentTimeMillis());
		showList(a);

		QuikSort q = new QuikSort();
		q.quickSort(a, lo, hi-1);
		//q.selectionSort(a);

		System.out.println("List After Sort:"+System.currentTimeMillis());
		showList(a);
	}

}
