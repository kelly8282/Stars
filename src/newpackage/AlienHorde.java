package newpackage;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
        private int count;
        private int down;
        private int time;

	public AlienHorde(int size)
	{
            time = 20;
            count = 0;
            down = 0;
            aliens = new ArrayList<Alien>();
            for ( int i = 0 ; i < size; i ++)
            {
                int blank  = 750 / size;

                Alien a = new Alien(blank *i +100 , 10);
                aliens.add(a);

            }
	}

	public void add(Alien al)
	{
            aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
            for ( int i = 0 ; i < aliens.size() ; i++)
            {
                Alien blank = aliens.get(i);
                blank.draw(window);
            }
	}

	public void moveEmAll()
	{
            time = time - 2;
            if (time > 0)
            {
                
                return;
            }
            
            
            for ( int i = 0 ; i < aliens.size() ; i++)
            {
                Alien blank = aliens.get(i);
                if ( down == 0)
                {
                    blank.setX(blank.getX() - 10);
                    count = count +1;
                }
                if ( count == 100 && down == 0)
                {
                    down = 1;
                    blank.setY(blank.getY() + 50);
                    count = 0;
                }
                if ( down == 1)
                {
                    blank.setX(blank.getX() + 10);
                    count = count +1;
                }
                if ( count == 100 && down == 1)
                {
                    down = 0;
                    blank.setY(blank.getY() + 50);
                    count = 0;
                }
                time = 20;
                
            }
	}

	public void removeDeadOnes(List<Ammo> shots)
	{   
             for ( int i = 0 ; i < shots.size(); i ++)
                {
                    Ammo blank = shots.get(i);
                    int temp = aliens.size();
                    for ( int j = 0; j < temp; j++)
                    {
                        Alien rawr = aliens.get(j);
                        if ( blank.getX() == rawr.getX() && blank.getY() == rawr.getY())
                        {
                            aliens.remove(j);
                            
                        }
                    }
                   
                     //remove alien
                 }
         }
	

	public String toString()
	{
		return "";
	}
}
