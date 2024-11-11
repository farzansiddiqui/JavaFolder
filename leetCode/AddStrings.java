package leetCode;

public class AddStrings {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "10";
      
        System.out.println(addString(num1, num2));
        
        
        
    }
    static String addString(String num1, String num2){
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1; // Pointer for num1
        int j = num2.length() - 1; // Pointer for num2
        int carry = 0; // To hold carry value
        while (i >= 0 || j >=0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry; // Calculate sum
            carry = sum / 10; // Update carry
         
            result.append(sum % 10); // Append current digit to result

            i--; // Move to the next digit in num1
            j--; // Move to the next digit in num2
        }
        return result.reverse().toString();
    }
}
