/*Concepts of Collection and Comparator are used here
 * Objects are stored in Array List in another class
 * Brand Names are displayed on the basis of the size used in program
 * Program is implemented as follows : 
 */

import java.util.*;

class HDTV      //HDTV class as required
{	
	//member variables of class
	private int size;
	private String brand_name;
 
	public HDTV(int size, String brand) //Parameterized Constructor
	{
		//initializing
		this.size = size;
		this.brand_name = brand;
	}
 
	public int getSize()   //getter for size
	{
		return size;
	}
 
	public void setSize(int size)  //setter for size
	{
		this.size = size;
	}
 
	public String getBrand() //getter for brand
	{
		return brand_name;
	}
 
	public void setBrand(String brand) //setter for brand
	{
		this.brand_name = brand;
	}
}

public class BrandSize  //BrandSize class
{	
	public static void main(String[] args) 
	{
		HDTV tv1 = new HDTV(51, "Samsung"); //creating first object of HDTV class
		HDTV tv2 = new HDTV(42, "Micromax"); //creating second object of HDTV class
		HDTV tv3 = new HDTV(75, "Sony"); //creating third object of HDTV class
 
		ArrayList<HDTV> al = new ArrayList<HDTV>(); //ArrayList declaration
		
		al.add(tv1); //Adding tv1 instance to ArrayList
		al.add(tv2); //Adding tv2 instance to ArrayList
		al.add(tv3); //Adding tv3 instance to ArrayList
 
		//Sorting the ArrayList in size
		
		Collections.sort(al, new SizeComparator());
		for (HDTV a : al) //displaying brand name according to size
		{
			//printing the brand name and size 
			System.out.println("Brand Name: "+a.getBrand()+"\tSize: "+a.getSize());
		}

	}

}

 //SizeComparator class implements comparator interface

class SizeComparator implements Comparator<HDTV> 
{
	@Override
	public int compare(HDTV tv1, HDTV tv2) {  //method of size comparator class
		int tv1Size = tv1.getSize();
		int tv2Size = tv2.getSize();
 
		if (tv1Size > tv2Size) 
		{
			return 1;
		} 
		else if (tv1Size < tv2Size) 
		{
			return -1;
		} 
		else 
		{
			return 0;
		}
	}
}
