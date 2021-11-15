class Printer{
	
	public void show(Number i) {
		
		System.out.println(i);
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		
		Printer p = new Printer();
		p.show(5.5);

	}

}
