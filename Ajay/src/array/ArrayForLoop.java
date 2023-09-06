package array;

public class ArrayForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,34,5,6};
for (int j=0; j<2;j++)
{
	System.out.println("hi");
	}
System.out.println("--------------------------------------------");
// A is lable in loop
A:for (int a : arr)
{
	System.out.println(a);
	
}
System.out.println("--------------------------------------------");
for (int i=0; i<arr.length-1;i--)
{
	System.out.println(arr[i]);	
}
	}

}
