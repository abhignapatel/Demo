import java.util.HashMap;

public class StringDuplicate {
    boolean test(String s) {
        boolean answer = false;

        HashMap<Character, String> hashMap = new HashMap<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if(hashMap.get(c)==null){ //not duplicate
                hashMap.put(c,"1");
            }else{//duplicate
                answer =true;
                break;
            }
        }
        return answer;
    }

}
