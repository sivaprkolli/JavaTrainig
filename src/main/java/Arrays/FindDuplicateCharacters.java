package Arrays;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String s = "Selenium";
        char c[] = s.toCharArray();
        System.out.println(s.charAt(4));
        System.out.println(s.length());
        System.out.println(c.length);

        //s
        //elenium

        //e
        //lenium

        for(int i = 0; i<c.length; i++){

            for(int j = i+1; j<s.length(); j++){
                    if(c[i] == c[j]){
                        System.out.println(c[i]);
                    }
            }
        }

    }
}
