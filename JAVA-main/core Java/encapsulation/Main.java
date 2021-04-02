package encapsulation;

public class Main
{
    public static void main(String[] args) {
        Box box = new Box(5,5,3);               //a Box object is created and datamembers are intialised by constructor
        System.out.println(box.findVolume());

        Box box2 = new Box();                                       // a Box object is created
        box2.setlength(5);                                          // all data members are initialised through public setter methods
        box2.setbreadth(3);                                         // as in encapsulation we don't provide direct access to data members and expose them through public methods
        box2.setheight(4);
        System.out.println("length: " + box2.getlength());
        System.out.println("height: " + box2.getheight());
        System.out.println("breadth: " + box2.getbreadth());
        System.out.println("volume of the box: " + box2.findVolume());

    }
}