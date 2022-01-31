import com.golden.gamedev.Game;
import com.golden.gamedev.GameLoader;
import java.awt.Graphics2D;

import javax.swing.plaf.DimensionUIResource;

public class FootBall extends Game{

    @Override
    public void initResource(){

    }

    @Override
    public void update(long I){

    }

    @Override
    public void render(Graphics2D gd){

    }

    public static void main(String[] args) {
        GameLoader game = new GameLoader();
        game.setup(new FootBall(), new DimensionUIResource(800, 600),false);
        game.start();
    }
    
}