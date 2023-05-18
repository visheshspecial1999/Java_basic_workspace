package Java_Array;
//113b.wap to remove the duplicate values from unsorted array without using  temporary  array .
import java.util.HashSet;
public class q113c {

	public static void main(String[] args) {
		int ar[]= {56,1,2,2,3,3,4,2,5,4,6,7,4,5,2,0};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<ar.length;i++)
		{
		hs.add(ar[i]);
		}
		for(int no:hs)
		{System.out.println(no);
	}
	}

}
