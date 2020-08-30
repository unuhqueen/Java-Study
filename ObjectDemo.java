class Student implements Cloneable{//cloneable하다는 것을 증명해야함
    String name;
    Student(String name){
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException {//clone() method의 접근제어자가 protected라서 super를 사용
    	return super.clone();
    }
    
    public boolean equals(Object obj) {
    //Object obj-> 자식 데이터타입(student)는 부모 데이터타입에 할당될 수 있다.
    //Object라는 자료형이기 때문에 Student class에는 접근 못함
    	
    	//Student s = obj; -> 부모가 자식의 데이터타입으로 변환되는건 불가능
    	Student s = (Student)obj; //강제 형변환
    	return this.name == s.name;
    	//앞에는 s1, 뒤에는 s2
    }
}
 
class ObjectDemo {
 
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true
        
        try {
			Student s3 = (Student)s1.clone();
			System.out.println(s1.name);
			System.out.println(s3.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
    }
 
}