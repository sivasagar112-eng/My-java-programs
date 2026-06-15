class Room
{
	int length;
	int breadth;
	Room(int x, int y)
	{
		length = x;
		breadth = y;
	}
	int area()
	{
		return length*breadth;
	}
}

class Bedroom extends Room
{
	int height;
	Bedroom(int x, int y, int z)
	{
		super(x, y);
		height = z;
	}
	int volume()
	{
		return length*breadth*height;
	}
}
public class singleTest
{
	public static void main(String args[])
	{
		Bedroom room1 = new Bedroom(5,6,7);
		int area1 = room1.area();
		int volume = room1.volume();
		System.out.println("Area of the bedroom" + " "+area1);
		System.out.println("Volume of the bedroom" + " "+ volume);
	}
	
}
		