public class ifelse {
    public static void main(String[] args) {
        int x=16;
        int y=10;
        int z=15;

        // if(x>=10)
        //     System.out.println("Hello");
        
        // if(x>10 && x<20)
        // {
        //     System.out.println("Hello");
        //     System.out.println("Thanks");
        // }
        // else{
        //     System.out.println("Bye");
        // }
            if(x>y && x>z){
                System.out.println("x is greatest");
            }
            else if(y>z){
                System.out.println("y is greatest");
            }
            else{
                System.out.println("z is greatest");
            }

    }
}
