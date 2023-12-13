import java.util.ArrayList;
public class arrarylist {

	public static void main(String[] args) {
		ArrayList<Integer> s=new ArrayList<Integer>();
		
		s.add(10);
		s.add(11);
		s.add(12);
		s.add(13);
		s.add(14);
		s.remove(1);
		System.out.println("size before addition: "+s.size());
		for(int i=0;i<s.size();i++) {
			System.out.print(s.get(i)+" ");
		}
		
//		//System.out.println(s.get(1));
//		System.out.println("size before addition: "+s.size());
//		
//		s.add(1,20);
//		
//		System.out.println("size after addition: "+s.size());
//		
//		System.out.println(s.get(1));
		

	

	}

}
