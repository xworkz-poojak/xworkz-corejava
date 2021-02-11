import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapProgram {
	public static void main(String[] args) {
		//Map<String, Integer> foodPrice=new HashMap<String,Integer>();//insertion not Maintained
		//Map<String, Integer> foodPrice=new LinkedHashMap<String,Integer>();//insertaion maintained
		Map<String, Integer> foodPrice=new TreeMap<String,Integer>();

		foodPrice.put("Noodles", 40);
		foodPrice.put("Swizwan", 60);
		foodPrice.put("pizza", 175);
		
		System.out.println(foodPrice);
		System.out.println("---------");
		System.out.println("The value by Key :"+foodPrice.get("Swizwan"));
		
		System.out.println(foodPrice.containsKey("pizza"));
		
		System.out.println(foodPrice.containsKey("Pizza"));
		System.out.println("---------");
		System.out.println(foodPrice.containsValue(60));
		System.out.println("----------");
		System.out.println(foodPrice);
		System.out.println(foodPrice.remove("pizza"));
		System.out.println(foodPrice);
		
		System.out.println("----------");
		Set<String> food=foodPrice.keySet();
		for (String fd : food) {
			System.out.println(fd+" "+foodPrice.get(fd));
			
		}
		//System.out.println(food);
		
		System.out.println("---------");
        System.out.println(foodPrice.isEmpty());
        foodPrice.clear();
        System.out.println(foodPrice.isEmpty());
	}

}
