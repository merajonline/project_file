class Bike
{ 
	String engnum;
	String color;
	String ownername;
	String bikenum;
	Bike(String engnum,String color)
	{
	this.engnum=engnum;
	this.color=color;
	}
	void SetOwnername(String ownername){
	this.ownername=ownername;

	}
	void SetBikenum(String bikenum)
	{
	this.bikenum=bikenum;

	}
	void display()
	{
	System.out.println("engine number:" + this.engnum);
	System.out.println("color:" + this.color);
	System.out.println("owner name:" + this.ownername);
	System.out.println("bike number:" + this.bikenum);

	}
	void start()
	{
		System.out.println(this.ownername + "started bike");

	}
	void move()
	{
		System.out.println(this.ownername + "moving on bike");
			}
			void stop()
			{
				System.out.println(this.ownername + "stopped bike");

			}
}
class Factory
{
	public static void main(String[] args)
	{
		Bike pulsar=new Bike("123","red");
		Bike bullet=new Bike("235","blue");
		pulsar.SetOwnername("hkb");
		pulsar.SetBikenum("123");
		bullet.SetOwnername("bbb");
		bullet.SetBikenum("456");
		bullet.start();
		bullet.move();
		bullet.stop();
		System.out.println();
		bullet.display();

	}
}