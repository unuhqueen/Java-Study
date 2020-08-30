class Student implements Cloneable{//cloneable�ϴٴ� ���� �����ؾ���
    String name;
    Student(String name){
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException {//clone() method�� ���������ڰ� protected�� super�� ���
    	return super.clone();
    }
    
    public boolean equals(Object obj) {
    //Object obj-> �ڽ� ������Ÿ��(student)�� �θ� ������Ÿ�Կ� �Ҵ�� �� �ִ�.
    //Object��� �ڷ����̱� ������ Student class���� ���� ����
    	
    	//Student s = obj; -> �θ� �ڽ��� ������Ÿ������ ��ȯ�Ǵ°� �Ұ���
    	Student s = (Student)obj; //���� ����ȯ
    	return this.name == s.name;
    	//�տ��� s1, �ڿ��� s2
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