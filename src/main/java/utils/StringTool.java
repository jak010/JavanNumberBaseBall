package utils;

import java.util.Arrays;
import java.util.List;

public class StringTool {

    public boolean duplicateCheck(String[] str) {
        List<String> temp = Arrays.asList(str);
        return temp.size() == temp.stream().distinct().count();
    }

    public static String[] StringBufferToStringArray(StringBuffer sb) {
        /* StringBuffer의 내용을 문자열 배열로 변환  */
        String[] temp = new String[sb.length()];
        for (int i = 0; i < sb.length(); i++) {
            temp[i] = Character.toString(sb.charAt(i));
        }
        return temp;
    }

}
