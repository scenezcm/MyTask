import java.util.*;
import static java.lang.System.out;
public class MyTask {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("01","Java");
		map.put("02","Aandroid");
		System.out.println(map.get("02"));
	}
	
	public static String GetType(Object o) {
		String str = o.getClass().toString();
		return str.substring(16);
	}
	
	public static String getType(Object o){ //获取变量类型方法
		return o.getClass().toString(); 
	} 
	
	public int Add(int a ,int b) {
		return a+b;
	}
	
	public int Add(int...num) {
		int s = 0;
		for(int i = 0;i<num.length;i++)
		{
			s = s+num[i];
		}
		return s;
	}
	
}
