public class overloadingexample {
    public static void main(String[] args) {
        System.out.println(feetandinchtocenti(6,0));
        System.out.println(feetandinchtocenti(7,5));
        System.out.println(feetandinchtocenti(72));
    }

    public static double feetandinchtocenti(double feet,double inch)
    {
        if(feet>=0 && (inch>=0&&inch<=12) )
        {
            double total_cms = (feet*12*2.54) + (inch*2.54);
            return total_cms;
        }
        else
            return -1;
    }

    public static double feetandinchtocenti(double inch)
    {
        if(inch>=0)
        {
            double feet = inch/12;
            double inches = inch%12;
            return feetandinchtocenti(feet,inches);
        }
        else
            return -1;
    }
}
