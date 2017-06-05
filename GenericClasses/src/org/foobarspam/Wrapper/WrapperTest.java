package org.foobarspam.Wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		Wrapper<String> w1 = new Wrapper<>("Hello");
		String s1 = w1.getObj();
		System.out.println("s1=" + s1);
		
		w1.setObj("Testing generics");
		String s2 = w1.getObj();
		System.out.println("s2=" + s2);
		
		w1.setObj(null);
		String s3 = w1.getObj();
		System.out.println("s3=" + s3);
		}
}