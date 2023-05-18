package collection_list;
// application of retailAll method of ArrayList class
import java.util.ArrayList;

public class array2 {

	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList<>();
		arrayList.add("apple");
		arrayList.add("boy");
		arrayList.add("cat");
		ArrayList arrayList2=new ArrayList();
		arrayList2.add("mango");
		arrayList2.add("boy");
		arrayList2.add("dog");
		
		// printing before applying retainAll() method
		System.out.println("Item list1: "+arrayList);
		System.out.println("Item list2: "+arrayList2);
		
//				Item list1: [apple, boy, cat]
//				Item list2: [mango, boy, dog]
		
		// printing after applying retainAll() method
		arrayList2.retainAll(arrayList);
		System.out.println("Item list1: "+arrayList);
		System.out.println("Item list2: "+arrayList2);
	}
//			Item list1: [apple, boy, cat]
//			Item list2: [boy]


}
