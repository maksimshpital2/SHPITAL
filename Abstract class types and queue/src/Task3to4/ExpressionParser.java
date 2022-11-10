package Task3to4;

import java.util.regex.Pattern;

public class ExpressionParser {
    public double TripleExpressionparse(String string, int... ints) {
        int z = 0;
        double answer = 0;
        Pattern p1 = Pattern.compile("[0-9]");
        Pattern p2 = Pattern.compile("-");
        Pattern p3 = Pattern.compile("\\+");
        Pattern p4 = Pattern.compile("/");
        Pattern p5 = Pattern.compile("\\*");
        Pattern p6 = Pattern.compile("\\(");
        Pattern p7 = Pattern.compile("\\)");
        Pattern p8 = Pattern.compile("[a-z]");
        Pattern p9 = Pattern.compile(" ");
        Pattern p10 = Pattern.compile(" +");

        for (int i = 0; i < string.length(); i++) {
            String a = string.charAt(i) + "";
            if (!p1.matcher(a).matches() & !p2.matcher(a).matches() & !p3.matcher(a).matches() & !p4.matcher(a).matches() & !p5.matcher(a).matches() & !p6.matcher(a).matches() & !p7.matcher(a).matches() & !p8.matcher(a).matches() & !p9.matcher(a).matches()) {
                System.out.println("Error");
                return 0;
            }
            if (p8.matcher(a).matches()) {
                string = string.replace(string.charAt(i) + "", String.valueOf(ints[z]));
                z++;
            }
        }
        String[] words = p10.split(string);
        double answer1 = 0;
        String[] buff;
        int l;
        boolean bool = false;
        for (int i = 0; i < words.length; i++) {
            if (p6.matcher(words[i]).matches()) {
                bool = true;
                int k = i;
                do {
                    switch (words[i + 2]) {
                        case "+":
                            answer1 = Double.parseDouble(words[i + 1]) + Double.parseDouble(words[i + 3]);
                            buff = new String[words.length - 2];
                            l = 0;
                            for (int j = 0; j < buff.length; j++) {
                                if (j == k + 1) {
                                    l += 3;
                                    buff[j] = String.valueOf(answer1);
                                } else {
                                    buff[j] = words[l];
                                    l++;
                                }
                            }
                            words = buff;
                            break;
                        case "-":
                            answer1 = Double.parseDouble(words[i + 1]) - Double.parseDouble(words[i + 3]);
                            buff = new String[words.length - 2];
                            l = 0;
                            for (int j = 0; j < buff.length; j++) {
                                if (j == k + 1) {
                                    l += 3;
                                    buff[j] = String.valueOf(answer1);
                                } else {
                                    buff[j] = words[l];
                                    if (l == words.length - 1) {
                                        break;
                                    }
                                    l++;
                                }
                            }
                            words = buff;
                            break;
                        case "*":
                            answer1 = Double.parseDouble(words[i + 1]) * Double.parseDouble(words[i + 3]);
                            buff = new String[words.length - 2];
                            l = 0;
                            for (int j = 0; j < buff.length; j++) {
                                if (j == k + 1) {
                                    l += 3;
                                    buff[j] = String.valueOf(answer1);
                                } else {
                                    buff[j] = words[l];
                                    if (l == words.length - 1) {
                                        break;
                                    }
                                    l++;
                                }
                            }
                            words = buff;
                            break;
                        case "/":
                            if (Double.parseDouble(words[i + 3]) == 0) {
                                System.out.println("division by zero");
                                return 0;
                            }
                            answer1 = Double.parseDouble(words[i + 1]) / Double.parseDouble(words[i + 3]);
                            buff = new String[words.length - 2];
                            l = 0;
                            for (int j = 0; j < buff.length; j++) {
                                if (j == k + 1) {
                                    l += 3;
                                    buff[j] = String.valueOf(answer1);
                                } else {
                                    buff[j] = words[l];
                                    if (l == words.length - 1) {
                                        break;
                                    }
                                    l++;
                                }
                            }
                            words = buff;
                            break;
                    }
                    i += 2;
                } while (!p7.matcher(words[i]).matches());
            }
            if (bool) {
                buff = new String[words.length - 2];
                l = 0;
                for (int j = 0; j < buff.length; j++) {
                    if (j == i - 2) {
                        l += 3;
                        buff[j] = String.valueOf(answer1);
                    } else {
                        buff[j] = words[l];
                        l++;
                    }
                }
                words = buff;
                bool = false;
            }
        }

        for (int i = 1; i < words.length; i++) {
            switch (words[i]) {
                case "*":
                    answer = Double.parseDouble(words[i - 1]) * Double.parseDouble(words[i + 1]);
                    words[i + 1] = String.valueOf(answer);
                    buff = new String[words.length - 2];
                    l = 0;
                    for (int j = 0; j < buff.length; j++) {
                        if (j == i - 1) {
                            l += 3;
                            buff[j] = String.valueOf(answer);
                        } else {
                            buff[j] = words[l];
                            l++;
                        }
                    }
                    words = buff;
                    i = 0;
                    break;
                case "/":
                    if (Double.parseDouble(words[i + 1]) == 0) {
                        System.out.println("division by zero");
                        return 0;
                    }
                    answer = Double.parseDouble(words[i - 1]) / Double.parseDouble(words[i + 1]);
                    words[i + 1] = String.valueOf(answer);
                    buff = new String[words.length - 2];
                    l = 0;
                    for (int j = 0; j < buff.length; j++) {
                        if (j == i - 1) {
                            l += 3;
                            buff[j] = String.valueOf(answer);
                        } else {
                            buff[j] = words[l];
                            l++;
                        }
                    }
                    words = buff;
                    i = 0;
                    break;
            }
        }

        for (int i = 1; i < words.length; i++) {
            switch (words[i]) {
                case "+":
                    answer = Double.parseDouble(words[i - 1]) + Double.parseDouble(words[i + 1]);
                    words[i + 1] = String.valueOf(answer);
                    break;
                case "-":
                    answer = Double.parseDouble(words[i - 1]) - Double.parseDouble(words[i + 1]);
                    words[i + 1] = String.valueOf(answer);
                    break;
            }
        }
        if (answer == -0) {
            answer = 0;
        }
        System.out.println(answer);
        return answer;
    }
}
