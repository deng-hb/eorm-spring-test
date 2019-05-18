package com.denghb;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1() {
        String str = "public void output() {\n" +
                "        String s = \"\"/**{\n" +
                "         hello world,\n" +
                "         eorm\n" +
                "         Select * from tb_user\n" +
                "         }*/;\n" +
                "\n" +
                "        String s2 = \"\"/**{\n" +
                "         }*/;\n" +
                "\n" +
                "        System.out.println(s);\n" +
                "    }";

        List<String> strs = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // `""/**{` start
            if ('"' == c && '"' == str.charAt(i + 1) && '/' == str.charAt(i + 2)
                    && '*' == str.charAt(i + 3) && '*' == str.charAt(i + 4) && '{' == str.charAt(i + 5)) {
                int j = i + 6;
                StringBuffer sb = new StringBuffer();
                for (; j < str.length(); j++) {
                    // `}*/;` end
                    if ('}' == str.charAt(j) && '*' == str.charAt(j + 1)
                            && '/' == str.charAt(j + 2) && ';' == str.charAt(j + 3)) {
                        break;
                    }
                    sb.append(str.charAt(j));
                }
                strs.add(sb.toString());
                i = j;
            }
        }

        System.out.println("===== output =====");
        for (String s : strs) {
            s = s.replaceAll("\n", "\" + \n\"");
            System.out.println(s);
            str = str.replaceFirst("\"\"/\\*\\*\\{", "\"" + s + "\"/**{");
        }
        System.out.println(str);

    }
}
