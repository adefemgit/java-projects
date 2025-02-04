package inheritance;

public class Mouse2 extends Mouse{

    String texture;


    public void setTexture(String texture){
        this.texture = texture;
        System.out.println("Texture: " + texture);
    }


}
