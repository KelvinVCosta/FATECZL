/**
 *
 * @author Kelvin
 */
public class CharToNumber {

    // Complete the encodeString function below.
    static void encodeString(String S) {
        S.toLowerCase();
        for (Character c : S.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                System.out.print(c.hashCode() - 96 + " ");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String S = "the sunset sets at twelve o' clock.";
        encodeString(S);
    }

}
