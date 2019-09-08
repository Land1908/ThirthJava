/*

 */
package ChuaBTB1;

public abstract class Audio{
    String name;
    String type;   
    String quality;
    int duration;
    
    abstract void play();
    
    void display(){
        System.out.println("The name is: " + name);
        System.out.println("The type is: " + type);
        System.out.println("The quality is: " + quality);
        System.out.println("The duaration is: " + duration);
    }
}
