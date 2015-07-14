package javagame;

import org.lwjgl.input.*;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState{
	
	Animation Razor, movingUp, movingDown, movingLeft, movingRight;
	Image worldMap;
	boolean quit = false;
	int[] duration = {200,200};
	float razorPositionX = 0;
	float razorPositionY = 0;
	float shiftX = razorPositionX + 320;
	float shiftY = razorPositionY + 160;
	
	public Play(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		worldMap = new Image("res/world_edited.png");
		Image[] walkUp = {new Image("res/Back.PNG"), new Image("res/Back.PNG")};
		Image[] walkDown = {new Image("res/Front.PNG"), new Image("res/Front.PNG")};
		Image[] walkLeft = {new Image("res/Left.PNG"), new Image("res/Left.PNG")};
		Image[] walkRight = {new Image("res/Right.PNG"), new Image("res/Right.PNG")};
		
		movingUp = new Animation(walkUp, duration, false);
		movingDown = new Animation(walkDown, duration, false);
		movingLeft = new Animation(walkLeft, duration, false);
		movingRight = new Animation(walkRight, duration, false);
		Razor = movingDown;
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		worldMap.draw(razorPositionX, razorPositionY);
		Razor.draw(shiftX, shiftY);
		g.drawString("Razor's X: " + razorPositionX + "\nRazor's Y: "+ razorPositionY, 500, 20);
		
		if(quit==true){
			g.drawString("Resume (R)", 250, 100);
			g.drawString("Main Menu (M)", 250, 150);
			g.drawString("Quit Game (Q)", 250, 200);
			if(quit==false){
				g.clear();
			}	
		}
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input input = gc.getInput();
		
		//up
		if(input.isKeyDown(Input.KEY_UP)){
			Razor = movingUp;
			razorPositionY += delta * .1f;
			if(razorPositionY > 160){
				razorPositionY -= delta * .1f;
			}
		}
		
		//down
		if(input.isKeyDown(Input.KEY_DOWN)){
			Razor = movingDown;
			razorPositionY -= delta * .1f;
			if(razorPositionY < -250){
				razorPositionY += delta * .1f;
			}
		}
		
		//left
		if(input.isKeyDown(Input.KEY_LEFT)){
			Razor = movingLeft;
			razorPositionX += delta * .1f;
			if(razorPositionX > 320){
				razorPositionX -= delta * .1f;
			}
		}
		
		//right
		if(input.isKeyDown(Input.KEY_RIGHT)){
			Razor = movingRight;
			razorPositionX -= delta * .1f;
			if(razorPositionX < -260){
				razorPositionX += delta * .1f;
			}
		}
		
		//escape
		if(input.isKeyDown(Input.KEY_ESCAPE)){
			quit = true;
		}
		
		//inside the menu statement
		if(quit==true){
			
			if(input.isKeyDown(Input.KEY_R)){
				quit = false;
			}
			
			if(input.isKeyDown(Input.KEY_M)){
				sbg.enterState(0);
			}
			
			if(input.isKeyDown(Input.KEY_Q)){
				System.exit(0);
			}
		}
	}
	
	public int getID(){
		return 1;
	}

}
