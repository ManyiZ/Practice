package snowman;
import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class

/**
 * <p>Create a snow man in a graphics window</p>
 * @author your name here
 */

public class SnowMan {

    // Your instance fields go here
    int x;
    int y;
    double scale;
    GWindow window;


    /**
     * Creates a snow man in at location (x,y) in the GWindow window.
     * @param x the x coordinate of the center of the head of the snow man
     * @param y the y coordinate of the center of the head of the snow man
     * @param scale the factor that multiplies all default dimensions for this snow man
     * (e.g. if the default head radius is 20, the head radius of this snow man is
     * scale * 20)
     * @param window the graphics window this snow man belongs to
     */
    public SnowMan(int x, int y, double scale, GWindow window)
    {
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.window = window;
        // initialize the instance fields

        // Put the details of the drawing in a private method
        this.draw();
    }

    /** Draw in the graphics window a snow man at location (x,y) */
    private void draw()
    {
        Oval body = new Oval((int) ((scale)*this.x), (int) ((scale)*this.y), (int)(55*this.scale),(int)(60*this.scale), Color.white, true);
        Oval head = new Oval(scaleX(10), (int) ((scale)*this.y - 30), (int)(35*this.scale),(int)(40*this.scale), Color.white, true);
        Oval button1 = new Oval(scaleX(25), (int) ((scale)*this.y + 20), (int)(5*this.scale),(int)(5*this.scale), Color.black, true);
        Oval button2 = new Oval(scaleX(25), (int) ((scale)*this.y + 30), (int)(5*this.scale),(int)(5*this.scale), Color.black, true);
        Oval button3 = new Oval(scaleX(25), (int) ((scale)*this.y + 40), (int)(5*this.scale),(int)(5*this.scale), Color.black, true);
        Oval eye = new Oval(scaleX(20), (int) ((scale)*this.y - 20), (int)(5*this.scale),(int)(5*this.scale), Color.black, true);
        Oval eye2 = new Oval(scaleX(30), (int) ((scale)*this.y - 20), (int)(5*this.scale),(int)(5*this.scale), Color.black, true);
        Line leftArm = new Line(scaleX(5), (int) ((scale)*this.y + 20), (int) ((scale)*this.x - 20), (int) ((scale)*this.y + 10), Color.black);
        Line rightArm = new Line(scaleX(50), (int) ((scale)*this.y + 20), (int) ((scale)*this.x + 75), (int) ((scale)*this.y + 10), Color.black);
        Rectangle hatBottom = new Rectangle(scaleX(0), (int) ((scale)*this.y-40),(int)(55*this.scale),(int)(15*this.scale), Color.red, true);
        Rectangle hatTop = new Rectangle(scaleX(10), (int) ((scale)*this.y-60),(int)(35*this.scale),(int)(35*this.scale), Color.red, true);
        Oval nose = new Oval(scaleX(25), scaleY(15), width(5),height(20), Color.orange, true);
        this.window.add(body);
        this.window.add(head);
        this.window.add(button1);
        this.window.add(button2);
        this.window.add(button3);
        this.window.add(eye);
        this.window.add(eye2);
        this.window.add(leftArm);
        this.window.add(rightArm);
        this.window.add(hatBottom);
        this.window.add(hatTop);
        this.window.add(nose);
    }
    private int scaleX(int a){
        return (int) ((scale)*this.x + a);
    }
    private int scaleY(int b){
        return (int) ((scale)*this.y + b);
    }
    private int width(int  c){
        return (int) (c*this.scale);
    }
    private int height(int  d){
        return (int) (d*this.scale);
    }
}
