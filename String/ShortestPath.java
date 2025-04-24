public class ShortestPath {
    public static float getShortestPath(String s ){
        int x =0 ;
        int y=0;

        for(int i =0;i<s.length();i++){  //tc O(n)
            char dir = s.charAt(i);

            //south 
            if(dir == 'S'){
                y--;
            }

            // north

            else if(dir =='N'){
                y++;
            }
            //east
            else if(dir == 'W'){
                x--;
            }
            else {
                x++;
            }
        }
        int x2= x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String s = "WNEENESENNN";
        System.out.println(getShortestPath(s));
    }
    
}
