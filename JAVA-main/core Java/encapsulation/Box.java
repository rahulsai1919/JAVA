package encapsulation;

public class Box {

        private int length;
        private int height;
        private int breadth;

        Box(int length,int height,int breadth)
        {
            this.length = length;
            this.height = height;
            this.breadth = breadth;
        }

        Box()
        {
            this(0,0,0);
        }

        public void setlength(int length) {
            this.length = length;
        }
        public void setheight(int height) {
            this.height = height;
        }
        public void setbreadth(int breadth) {
            this.breadth = breadth;
        }

        public int getlength(){
            return length;
        }
        public int getheight(){
            return height;
        }
        public int getbreadth(){
            return breadth;
        }

        public int findVolume()
        {
            return length*height*breadth;
        }

}
