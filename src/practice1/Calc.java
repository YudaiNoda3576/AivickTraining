package practice1;

public class Calc {
	public static void main(String[] args) {
		try {
			String opr = args[0];
			int num1 = Integer.parseInt(args[1]);
			int num2 = Integer.parseInt(args[2]);	

			calc(opr, num1, num2);
		 } catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println("例外が発生しました。四則演算記号、数値１、数値２を入力してください");
		  } catch(NumberFormatException e) {
			  System.out.println("例外が発生しました。不正な値です。");
		  } catch(IllegalArgumentException e) {
			  System.out.println("0で割ることはできません");
		  }
	}
	
	public static void calc(String opr, int num1, int num2) throws 
		ArrayIndexOutOfBoundsException
		,NumberFormatException
		,IllegalArgumentException{
//		==　はプリミティブ型のみ（int,doubleなど）
		if(opr.equals("+")) {
			System.out.println(num1 + num2); 
		} else if ( opr == "-") {
			System.out.println(num1 - num2); 
		} else if ( opr == "m") {
			System.out.println(num1 * num2); 
		} else if ( opr == "/") {
			System.out.println(num1 / num2); 
		} else {
			System.out.println("入力をやり直してください");
		}
//		switch文の場合
//		switch(opr) {
//		case"+":
//			System.out.println(num1 + num2);
//			break;
//		case"-":
//			System.out.println(num1 - num2);
//			break;
//		case"*":
//			System.out.println(num1 * num2);
//			break;
//		case"/":
//			System.out.println(num1 / num2);
//			break;
//		}
	}
}
