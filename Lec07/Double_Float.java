package Lec07;

public class Double_Float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = (byte) (132);
		System.out.println(b);
		int i=300;
		byte b1= (byte) (i);  // 10 kg ko 5 kg me put karne pe error diya so typecast kiya
		short s= (short) (i);
		System.out.println(b1);
		System.out.println(s);
		byte b2=15;
		int i2= b2;         // 10 kg ko 5 kg me put karne pe error diya so typecast kiya
		System.out.println("i2="+i2);
		
		long l=123455566678L;
	}

}
