package newpackage;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,30,30,0);
	}

	public Alien(int x, int y)
	{
		super(x,y, 30 , 30);
                speed = 1;
                try
		{
			URL url = getClass().getResource("alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("Error: File not found");
		}
	}

	public Alien(int x, int y, int s)
	{
		super(x,y,30 , 30);
                speed = s;
                try
		{
			URL url = getClass().getResource("alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("Error: File not found");
		}
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			URL url = getClass().getResource("alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("Error: File not found");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
	{
	   if ( direction == "LEFT") //left
           {
               int a = getX();
               a = a - speed;
               if ( a >= 0)
               {
                   setX(a);
               }
           }
           if ( direction == "RIGHT") //right
           {
               int a = getX();
               a = a + speed;
               if ( a <= (800 - getWidth()))
               {
                   setX(a);
               }
           }
           if ( direction == "UP") //up
           {
               int a = getY();
               a = a - speed;
               if ( a >= 0)
               {
                   setY(a);
               }
           }
           if ( direction == "DOWN") //down
           {
               int a = getY();
               a = a + speed;
               if ( a <= (600 - getHeight()))
               {
                   setY(a);
               }
           }
	}
	

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
