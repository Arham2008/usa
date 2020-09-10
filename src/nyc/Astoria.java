package nyc;

public class Astoria {

	
	int myNum=123;
	static int  price =230;
	
	public static void main(String[] args) {
		System.out.println("how are you");
		
		
		Astoria art =new Astoria();
		System.out.println(art.myNum);
		 art.myNum=345;
		
		System.out.println(art.myNum);
		
       System.out.println(Astoria.price);
       Astoria.price=400;
       System.out.println(Astoria.price);
       
	}

}
