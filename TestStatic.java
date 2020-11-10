public class TestStatic {
	public int x;

	public static void main(String[] args) {
		System.out.println(x);

		metodo(); 
		metodoStatic();

	}

	public void metodo() {
		System.out.println("Metodo");
	}

	public static void metodoStatic() {
		System.out.println("Metodo static");
	}
}