package scjp.exam.stuff;


enum CoffeSize {
    BIG(11),
    HUGE(22),
    OVER(33){
	//override
	public String  getLid() {
	    return "A";
	}
    };

    private int once;		 

    CoffeSize(int once){
	this.once = once;
    }


    public int getOnce(){
	return once;
    }
    //overriden    
    public String  getLid() {
	return "B";
    }


}


// class Coffe {
//     CoffeSize size;
// }

public class CoffeTest3 {
     CoffeSize size;

    public static void main(String[] args) {
	// cant invoke enum constructor directly
	// CoffeSize name = new CoffeSize(10);
	//	Coffe drink = new Coffe();
	//	CoffeTest3 drink = new CoffeTest3();
	//	drink.size = CoffeSize.BIG;
	//	drink.size = CoffeSize.BIG;
	// THREE(11,22,"MAN")
	// System.out.println(CoffeSize.TOO.getThird());
	// System.out.println(CoffeSize.BIG.getLid()); // B
	// System.out.println(CoffeSize.OVER.getLid()); //
	//	System.out.println(drink.size);
	//	System.out.println(CoffeSize.HUGE);
	//	System.out.println(drink.size.getThird());
	//	System.out.println(CoffeSize.BIG.getOnce());

	//		System.out.println(CoffeSize.values());

	for (CoffeSize cs  : CoffeSize.values()) {
	    System.out.println(cs
			       +"  "+cs.getOnce()
			       +" "+cs.getLid()
			       );
	}
    }
}
