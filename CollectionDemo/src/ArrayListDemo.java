import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {
	
	public void m1(){
		ArrayList<String> companies=new ArrayList<String>();
		//ArrayList companies=new ArrayList();
        companies.add("Apple");
        companies.add("IBM");
        companies.add("Microsoft");
        
        //companies.add(7);
        
        //companies.add(new Integer(7));
        
        
        
        for(String company:companies) {
        //for(Object copmany:companies) {
        System.out.println(company);
        }
        Iterator<String> itr=companies.iterator();
        String company = null;
        while(itr.hasNext()){
        	company=itr.next();
        	System.out.println(company);
        	}

        
        Object[] cc=companies.toArray();
        System.out.println(cc[0]);//Apple
        System.out.println(cc[1]);//IBM
        System.out.println(cc[2]);//Microsoft
        


        
        

	}

}
