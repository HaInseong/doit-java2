package ch02;

public class EqualsTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student Lee = new Student(100, "Lee");
		Student Lee2 = Lee;
		Student Shun = new Student(100, "Lee");
		
		
		//String형은 자동으로 equals()가 오버라이딩되어 있지만 Student는 직접 해줘야함
		//물리적(메모리 위치) 동일함이 아닌 논리적인 동일함을 위해 equals()메서드를 재정의 하였다면 hashCode()메서드도 재정의하여 동일한 hashCode값이 반환되도록 논리를 맞춰준다.
		System.out.println(Lee.equals(Lee2 ));
		System.out.println(Lee == Lee2);
		System.out.println(Lee.equals(Shun)); //eqauls()는 학번이 같은 경우 true를 반환하게끔 오버라이딩 해놨음.
		System.out.println(Lee == Shun); //참조값은 다르므로 false 반환
		
		System.out.println(); 
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		
		Student Lee3 = (Student) Lee.clone();
		System.out.println(Lee3.toString());
	} 

}
  