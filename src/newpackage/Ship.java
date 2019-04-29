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

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
           this(50,50,50,50,1);
	}

	public Ship(int x, int y)
	{
	   super(x,y, 50 , 50);
           speed = 1;
         
           try
	   {
		URL url = getClass().getResource("ship.jpg");
		image = ImageIO.read(url);
            }
            catch(Exception e)
            {
                 System.out.println("Error: File not found");
            }
	}

	public Ship(int x, int y, int s)
	{
	   super(x,y, 50 , 50);
           speed = s;
         
           try
	   {
		URL url = getClass().getResource("ship.jpg");
		image = ImageIO.read(url);
            }
            catch(Exception e)
            {
                 System.out.println("Error: File not found");
            }
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
                        System.out.println("Error: File not found");
			//feel free to do something here
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


