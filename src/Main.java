/**
 * Created by KPS on 7/18/2020.
 */
public class Main {
    public static void main(String[] args) {
        String sentence = " w3resource";
        int count = 0 ;
        char[] chars = sentence.toCharArray();

        for (int i = 0 ; i<chars.length;i++){
            if (chars[i]=='a'||chars[i]=='o'||chars[i]=='i'||chars[i]=='u'||chars[i]=='e')
            count++;
        }
        System.out.println(count);
    }
}
