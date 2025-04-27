

public class FirstLetterToUpperCase {
    public static String toUpper(String s){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);

        for(int i =1;i<s.length();i++){
            if(s.charAt(i)== ' ' && i<s.length()-1){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "hello i am furu";
        System.out.println(toUpper(s));
    }
    
}
//tc O(n)
