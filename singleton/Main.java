public class Main {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance("algo", 5);
		
		Singleton objt1 = Singleton.getAnotherInstance("algo");
		Singleton objt2 = Singleton.getAnotherInstance("algo");
		Singleton objt3 = Singleton.getAnotherInstance("algo");
		Singleton objt4 = Singleton.getAnotherInstance("algo");
		Singleton objt5 = Singleton.getAnotherInstance("algo");
		Singleton objt6 = Singleton.getAnotherInstance("algo");
		Singleton objt7 = Singleton.getAnotherInstance("algo");
		Singleton objt8 = Singleton.getAnotherInstance("algo");
		Singleton objt9 = Singleton.getAnotherInstance("algo");
		
		
		System.out.println(objt1);
		System.out.println(objt2);
		System.out.println(objt3);
		System.out.println(objt4);
		System.out.println(objt5);
		System.out.println(objt6);
		System.out.println(objt7);
		System.out.println(objt8);
		System.out.println(objt9);
	}

}