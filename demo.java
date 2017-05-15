import java.util.*;
public class demo {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Cal cal = new Cal(str);
		String res = cal.res();
		System.out.println(res);
    }
	public static class Cal{
		private String calStr = "";
		public Cal(){}
		public Cal(String str){
			calStr = str;
		}
		public String res(){
			int mul = 1;
			int temp = 0;
			String[] strList = calStr.split(",");
			int []intList = new int[strList.length];
			int []mulList = new int[strList.length];
			//转型
			for(int i = 0; i < strList.length; i++){
				intList[i] = Integer.parseInt(strList[i]);
			}
			//运算
			for(int i = 0; i < strList.length; i++){
				temp = intList[i];
				intList[i] = 1;
				for(int x = 0; x < intList.length; x++){
					mul *= intList[x];
				}
				mulList[i] = mul;
				mul = 1;
				intList[i] = temp;
			}
			calStr = "";
			//拼接
			for(int i = 0; i < mulList.length; i++){
				calStr += mulList[i]+",";
			}
			return calStr;
		}
	}
}
