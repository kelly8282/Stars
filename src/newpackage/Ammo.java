package newpackage;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(10,10);
	}

	public Ammo(int x, int y)
	{
		super(x,y,10,10);
                speed = 1;
	}

	public Ammo(int x, int y, int s)
	{
		super(x,y,10,10);
                speed = s;
	}

	public void setSpeed(int s)
	{
                speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
             window.setColor(Color.YELLOW);
            window.fillRect(getX(),getY(),getWidth(),getHeight());
	}
	
	
	public void move( String direction )
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

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
