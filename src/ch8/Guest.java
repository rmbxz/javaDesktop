package ch8;

/**
 * Describe class Guest here.
 *
 *
 * Created: Tue Oct 31 14:39:14 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Guest {

	public static void main(String[] args) {
	    Juice juice = new Juice();
	    Glass<Juice> glass = new Glass<Juice>();
 	    
	    glass.liquid=juice;
	    Juice juice2= glass.liquid; 

	    Glass<Water> glass2 = new Glass<Water>();
	    Water water = new Water();
	    glass2.liquid=water;

	    Red red = new Red();
	    Green green = new Green();
	    Blue blue = new Blue();

	    // class           public class Color<R,G,B> 
	    // constructor	public Color(R red,G green,B blue) 

	    Color<Red,Green,Blue> color = new Color<>(red,green,blue);
	    Color<Red,Green,Blue> color2 = new Color<>();

	    // method     public<J,W> CockTail mix(J juice,W water) 
	    Bartender bar = new Bartender();
	    CockTail CockTail =bar.<Juice,Water>mix(juice, water);
	    bar.<Juice,Water>mix(juice, water);
	    Bartender.<Juice,Water>mix3(juice,water);

	    // class  public class Glass2 <T extends Liquid>   // extends or implements 
	    Glass2<Juice> g2 = new Glass2<Juice>();  // ok, Juice implements Liquid
	    Glass2<Water> g3 = new Glass2<Water>();  // ok, water implements Liquid
	    //	    Glass2<Cake> g3 = new Glass2<Cake>();  // no, Cake not implements Liquid


	    Glass4<OrangeJuice>  orange = new Glass4<OrangeJuice> ();
	    //	    Glass4<AppleJuice>    apple = new Glass4<AppleJuice>  (); 

	    //Glass5<Juice> juice3 = new Glass5<OrangeJuice>(); // no
	    Glass6<Juice> glass6 = new Glass6<Juice>();
	    Glass6<Juice> glass7 = new Glass6<Juice>();
	    //	    glass6.add(glass7);// ok but Glass6<Juice> only

	    Glass6<Water> glass8 = new Glass6<Water>();
	    //	    glass8.add(glass8);// ok 


	    Tray tray = new Tray();
	    tray.add(glass6);


	}
}
