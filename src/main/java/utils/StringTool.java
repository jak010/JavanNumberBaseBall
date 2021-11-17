package utils;

import java.util.Arrays;
import java.util.List;

public class StringTool {

    public boolean duplicateCheck(String[] str) {
        List<String> temp = Arrays.asList(str);
        return temp.size() == temp.stream().distinct().count();
    }

}
