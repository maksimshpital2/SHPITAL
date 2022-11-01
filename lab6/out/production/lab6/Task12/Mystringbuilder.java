public class Mystringbuilder {
    private String string;

    Mystringbuilder(String string) {
        this.string = string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public String append(Object object) {
        return string + object;
    }

    public int compareTo(Mystringbuilder mystringbuilder) {
        if (string.length() == mystringbuilder.getString().length()) {
            return 0;
        } else {
            return string.length() - mystringbuilder.getString().length();
        }
    }

    public String delete(int start, int end) {
        end--;
        String str = "";
        for (int i = 0; i < start; i++) {
            str += string.charAt(i);
        }
        for (int i = end; i < string.length(); i++) {
            str += string.charAt(i);
        }
        string = str;
        return string;
    }

    public String deleteCharAt(int index) {
        String str = "";
        for (int i = 0; i < index; i++) {
            str += string.charAt(i);
        }
        for (int i = index + 1; i < string.length(); i++) {
            str += string.charAt(i);
        }
        string = str;
        return string;
    }

    public int indexOf(char str) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == str) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(char str, int index) {
        for (int i = index; i < string.length(); i++) {
            if (string.charAt(i) == str) {
                return i;
            }
        }
        return -1;
    }

    public String insert(Object object, int index) {
        String str = "";
        for (int i = 0; i < index; i++) {
            str += string.charAt(i);
        }
        str += object;
        for (int i = index + 1; i < string.length(); i++) {
            str += string.charAt(i);
        }
        string = str;
        return string;
    }

    public int lastIndexOf(char str) {
        for (int i = string.length() - 1; i == 0; i--) {
            if (string.charAt(i) == str) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(char str, int index) {
        for (int i = index; i == 0; i--) {
            if (string.charAt(i) == str) {
                return i;
            }
        }
        return -1;
    }

    public String replace(int start, int end, String str) {
        String str1 = "";
        end--;
        for (int i = 0; i < start; i++) {
            str1 += string.charAt(i);
        }
        str1 += str;
        for (int i = end; i < string.length(); i++) {
            str1 += string.charAt(i);
        }
        string = str1;
        return string;
    }

    public String reverse() {
        String str1 = "";
        for (int i = string.length() - 1; i == 0; i--) {
            str1 += string.charAt(i);
        }
        string = str1;
        return string;
    }

    @Override
    public String toString() {
        return string;
    }
}