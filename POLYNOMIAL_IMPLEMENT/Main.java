
public class Main {

	public static void main(String[] args) {

		Polynomial poly1 = new Polynomial();

		poly1.insert(23,6);
		poly1.insert(2,4);
		poly1.insert(12,3);
		//poly1.insert(5,0);
		//poly1.insert(2.2f,8);
		//poly1.insert(2,7);
	//	poly1.insert(4, 0);

		Polynomial poly2 = new Polynomial();

		poly2.insert(12,6);
		poly2.insert(7,3);
		poly2.insert(25,5);
		poly2.insert(43,1);
		//poly2.insert(2.2f,7);
		//poly2.insert(2,9);
		//poly2.insert(2, 0);
		//poly2.insert(100, 2);

		//Polynomial poly3 = poly1.muti_poly(poly2);
		
		PolyNode poly4 =Polynomial.add_poly(poly1,poly2);

		//Polynomial poly4 =poly1.add_poly(poly1,poly2);

		System.out.println(Polynomial.Display(poly1.start));
		//System.out.println(poly1);

		System.out.println(Polynomial.Display(poly2.start));
		//System.out.println(poly2;
		
		//System.out.println(poly4);
		//System.out.println(Polynomial.Display(poly4));
	}

}
