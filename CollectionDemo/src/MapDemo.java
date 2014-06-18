import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapDemo {
	public void m1(){
		Map<String,Integer> numbers=new HashMap<String,Integer>();
        numbers.put("one",new Integer(1));
        numbers.put("two",2);
        numbers.put("three",3);
        //System.out.println(numbers.get("one"));//1
        //System.out.println(numbers);//{one=1, two=2, three=3} or {two=2, three=3, one=1}
        //System.out.println(numbers.containsKey("two"));//true
        //System.out.println(numbers);//{one=1, two=2, three=3}
        //System.out.println(numbers.containsValue(4));//false
        //System.out.println(numbers.remove("three"));//3
        //System.out.println(numbers);//{one=1, two=2}
        //numbers.clear();
        //System.out.println(numbers);//{}
        
        Map<String,Integer> numbers1=new HashMap<String,Integer>();
        numbers.put("one1",new Integer(1));
        numbers.put("two",6);
        numbers.put("three1",3);
        
        numbers.putAll(numbers1);
        System.out.println(numbers);
        
        
              

	}

}
