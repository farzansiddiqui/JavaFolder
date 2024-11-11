
public class Operator {
    public static void main(String[] args) {

        String val  = "aabcc";
        StringBuilder sBuilder = new StringBuilder();
        char previous = 0;
        int counter = 0;
        char[] inputChars = val.toCharArray();

        for(char c:inputChars){
                if (c == previous) {
                    counter++;
                }else if(previous != 0){
                    sBuilder.append(counter).append(previous);
                    previous = c;
                    counter = 1;
                
                }
                
        }
        sBuilder.append(counter).append(previous);
        System.out.println(sBuilder.toString());


    }
    

    
}
