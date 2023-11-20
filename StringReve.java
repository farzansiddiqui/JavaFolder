  public class StringReve {
    public static void main(String[] args) {
        String original  = "acb";
        String revers = "";
        
        
        StringBuilder sBuilder = new StringBuilder(original).reverse();
        StringBuffer stringBuffer = new StringBuffer(original).reverse();
        System.out.println(sBuilder.toString());
        System.out.println(stringBuffer);
        for (int i = 0; i < original.length(); i++) {
            revers = original.charAt(i)+revers;
        }
        System.out.println(revers);
    }
}
