import java.util.Arrays;
public class test03 {
    public static void main(String[] args) {
        for (int i = 1; i < 6 * 7 * 8; i++) {
            if (i % 6 == 0 && i % 7 == 0 && i % 8 == 0) {
                System.out.println(i);
            }
        }
        System.out.println(isRegularMatching("*txt","1.txt"));
    }

/*【程序说明】
    应用计算机处理日常事务或者是编写程序的时候，经常需要用到带有通配符的字符串匹配。

    比如：linux命令行下输入，ls .txt就是列出当前目录下所有的结尾是.txt的文件。

    下面一段函数实现了带有$和*两种通配符的字符串的匹配功能。

    其中：$表示长度大于0的数字串,*表示任意长度的字符串。

    要求：按照自己对于算法的理解填写该函数的5个空白。

    请注意：必须是完全匹配才能返回true，比如1.txt, a.txt可以匹配.txt,2.tx或者2.txta不能匹配.txt。函数的参数与返回值的说明请参见函数的注释。*/
// 功能描述: 表达式是否匹配成功, $表示长度大于0的数字串，*表示任意长的字符串
// 输入参数:@pRule, 以'\0'结束的字符串，表示规则;
//         @pStr, 以'\0'结束的待匹配的字符串;
// 返回值: true:匹配成功; false: 匹配失败
        public static boolean isRegularMatching(String rule, String str) {
            int lRule = rule.length();
            int lStr = str.length();
            int iRule = 0;
            int iStr = 0;
            while (iRule < lRule && iStr < lStr) {
                switch (rule.charAt(iRule)) {
                    case '*': {
                        iRule += 1;
                        if (iRule >= lRule) {
                            return true;
                        } else {
                            for (int i = iStr; i < lStr; i++) {
                                if (str.substring(i).equals(rule.substring(iRule))) {
                                    return true;
                                }
                            }
                        }
                        break;
                    }
                    case '$': {
                        if (str.charAt(iStr)<'0' || str.charAt(iStr)>'9') {
                            return false;
                        }
                        while ((iStr < lStr) && (str.charAt(iStr) >= '0') && (str.charAt(iStr) <= '9')) {
                            iStr += 1;
                        }
                        iRule += 1;
                        break;
                    }
                    default: {
                        if (rule.charAt(iRule) != str.charAt(iStr)) {
                            return false;
                        }
                        iRule += 1;
                        iStr += 1;
                        break;
                    }
                }
            }
            if (iRule < lRule && iStr >= lStr) {
                if (rule.charAt(iRule) == '*') {
                    return true;
                }
            } else {
                return  iStr >= lStr;
            }
            return false;
    }


    
}