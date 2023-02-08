class test{
	int eno;
	String name;
	test(){
		eno=180;
		name="praveen";
	}
	public test(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "test [eno=" + eno + ", name=" + name + "]";
	}

	public class test1 {
		public static void main(String[] args) {
			test[] ta=new test[] {
					new test(18,"Kohli"),
					new test(45,"Rohit"),
					new test(12,"Yuvi"),
					new test(7,"Dhoni")
			};
			for(test t:ta) {
				System.out.println(t);
			}
		}

	}
}