package ch03;

public class StringTest2 {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		System.out.println(java); //String은 자동으로 toString메서드가 Override 되어있음
		System.out.println(System.identityHashCode(java)); 
		
		java = java.concat(android);
		System.out.println(java);
		System.out.println(System.identityHashCode(java));  
		//우리가 문자열을 연결할 일들이 많이 있는데, concat()로 객체간의 연결은 잘 되었지만 새로운 객체로 메모리영역을 차지한다. 
		//그러므로 StringBuilder나 StringBuffer를 이용한다.
	}
 
}
