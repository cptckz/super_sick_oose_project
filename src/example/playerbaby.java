package example;
import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SlickException;

public class playerbaby {
	Image player = null;
	public int LEFT = 0;
	public int RIGHT = 1;
	public int IDLE = -1;
	public int direction;
	public int posX = 210;
	public int posY = 210;
	public int playerW = 90;
	public int playerH = 180;
	public Animation a;

	public Animation getAnimation ( Image player , int spritesX, int spritesY , int spriteWidth , int spriteHeight, int frames, int duration )
	{
		Animation a = new Animation(false);
		
		int c = 0;
		for( int y = 0 ; y < spritesY; y++)
		{
			for( int x = 0 ; x < spritesX; x++)
			{
				if( c < frames ) a.addFrame( player.getSubImage(x*spriteWidth, y*spriteHeight, spriteWidth, spriteHeight), duration);
				c++;
			}
		}
		
		return a;
	}

	
	public void init(GameContainer gc) throws SlickException{	
		
		
		//player = new Image("Rec/playersheet.png");
		Image player = new Image("Rec/playersheet3.png");
		a = getAnimation ( player, posX , posY , 80, 188, 12, 100 );

		
		
	}
	
	public void update()
		throws SlickException
	{
		move();

	}
	public void move(){
		if(direction == RIGHT){
			posX -= 20;
			a.update(100);

		}
		else if(direction == LEFT){
			posX += 20; 
			a.update(100);

			//a.draw(posX,posY, playerW,playerH);

		}
		else if(direction == IDLE){
			
		}
		//a.update();

	}
	public void render()
	throws SlickException{
	a.draw(posX,posY);
}



//public void move(){
//	if(direction == LEFT){
//		x -= 1; 
//	}
//	else if(direction == RIGHT){
//		x += 1;		
//	}else if(direction == IDLE){
//		
//		}	
	//}
}