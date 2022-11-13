package Task1to2;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    private String[] arr;

    Calculator(String expression) {
        Pattern p1 = Pattern.compile("[0-9]");
        Pattern p2 = Pattern.compile("/");
        Pattern p3 = Pattern.compile("x");
        Pattern p4 = Pattern.compile("\\+");
        Pattern p5 = Pattern.compile("-");

        boolean s = false;
        int buff1 = 0;
        int buff2 = 0;

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) != ' ') {
                Matcher m1 = p1.matcher(expression.charAt(i) + "");
                Matcher m2 = p2.matcher(expression.charAt(i) + "");
                Matcher m3 = p3.matcher(expression.charAt(i) + "");
                Matcher m4 = p4.matcher(expression.charAt(i) + "");
                Matcher m5 = p5.matcher(expression.charAt(i) + "");
                if (!m1.matches() & !m2.matches() & !m3.matches() & !m4.matches() & !m5.matches()) {
                    System.out.println("Неверный символ " + expression.charAt(i));
                    s = true;
                    break;
                }
                if (m1.matches()) {
                    buff2++;
                }
                if (m2.matches() | m3.matches() | m4.matches() | m5.matches()) {
                    buff1++;
                }
                if (buff1 >= buff2) {
                    System.out.println("Неверное количество спец. символов");
                    s = true;
                    break;
                }
            }
        }
        if (!s) {
            Pattern pattern = Pattern.compile(" ");
            arr = pattern.split(expression);
        } else {
            arr = new String[0];
        }
    }

    public String[] getArr() {
        return arr;
    }

    public void reading() {
        if (arr.length != 0) {
            double answer = 0; // ответ
            int buff = 0; // буферная переменная для запоминания числа, при наличии спец. знаков в конце и чисел в начале записи
            boolean s = false; //флаг, показывающий, идут ли подряд два спец. знака
            for (int i = 0; i < arr.length; i++) {
                switch (arr[i]) {
                    case "x":
                        if ((i + 1) <= arr.length - 1) { // проверка на конец массива
                            if ((Objects.equals(arr[i + 1], "/") | Objects.equals(arr[i + 1], "+")
                                    | Objects.equals(arr[i + 1], "-") | Objects.equals(arr[i + 1], "x")) & !s) {
                                // проверка на наличие идущих подряд двух спец. знаков
                                s = true;
                                answer = answer * Double.parseDouble(arr[i - 2]); // записываем ответ
                                arr[i] = String.valueOf(answer); //заменяем текущую ячейку ответом
                                if (buff == 0) { //проверка для присвания буферной переменной только один раз вначале
                                    buff = i - 3;
                                }
                            } else if (s) { //выполняется при наличии идущих подряд двух спец. знаков
                                answer = Double.parseDouble(arr[buff]) * answer;
                                arr[i] = String.valueOf(answer);
                                buff--; //передвигаем буфер на один назад
                                if (!Objects.equals(arr[i + 1], "/") & !Objects.equals(arr[i + 1], "+")
                                        & !Objects.equals(arr[i + 1], "-") & !Objects.equals(arr[i + 1], "x")) {
                                    //опускаем флаг, если дальше нет идущих подряд двух спец. знаков
                                    s = false;
                                }
                            } else { //обычная запись подряд
                                answer = Double.parseDouble(arr[i - 1]) * Double.parseDouble(arr[i - 2]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            }
                        } else if (s) { //для последнего символа, если два подряд - спец.
                            answer = Double.parseDouble(arr[buff]) * answer;
                            arr[i] = String.valueOf(answer);
                        } else { //для последнего символа, если как обычно
                            answer = Double.parseDouble(arr[i - 1]) * answer;
                            arr[i] = String.valueOf(answer);
                        }
                        break; //далее идентчино для знаков деления, сложения и вычитания
                    case "/":
                        if ((i + 1) <= arr.length - 1) {
                            if ((Objects.equals(arr[i + 1], "/") | Objects.equals(arr[i + 1], "+")
                                    | Objects.equals(arr[i + 1], "-") | Objects.equals(arr[i + 1], "x")) & !s) {
                                s = true;
                                answer = answer / Double.parseDouble(arr[i - 1]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            } else if (s) {
                                answer = Double.parseDouble(arr[buff]) / answer;
                                arr[i] = String.valueOf(answer);
                                buff--;
                                if (!Objects.equals(arr[i + 1], "/") & !Objects.equals(arr[i + 1], "+")
                                        & !Objects.equals(arr[i + 1], "-") & !Objects.equals(arr[i + 1], "x")) {
                                    s = false;
                                }
                            } else {
                                answer = Double.parseDouble(arr[i - 2]) / Double.parseDouble(arr[i - 1]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            }
                        } else if (s) {
                            answer = Double.parseDouble(arr[buff]) / answer;
                            arr[i] = String.valueOf(answer);
                        } else {
                            answer = Double.parseDouble(arr[i - 1]) / answer;
                            arr[i] = String.valueOf(answer);
                        }
                        break;
                    case "+":
                        if ((i + 1) <= arr.length - 1) {
                            if ((Objects.equals(arr[i + 1], "/") | Objects.equals(arr[i + 1], "+")
                                    | Objects.equals(arr[i + 1], "-") | Objects.equals(arr[i + 1], "x")) & !s) {
                                s = true;
                                answer = answer + Double.parseDouble(arr[i - 2]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            } else if (s) {
                                answer = Double.parseDouble(arr[buff]) + answer;
                                arr[i] = String.valueOf(answer);
                                buff--;
                                if (!Objects.equals(arr[i + 1], "/") & !Objects.equals(arr[i + 1], "+")
                                        & !Objects.equals(arr[i + 1], "-") & !Objects.equals(arr[i + 1], "x")) {
                                    s = false;
                                }
                            } else {
                                answer = Double.parseDouble(arr[i - 1]) + Double.parseDouble(arr[i - 2]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            }
                        } else if (s) {
                            answer = Double.parseDouble(arr[buff]) + answer;
                            arr[i] = String.valueOf(answer);
                        } else {
                            answer = Double.parseDouble(arr[i - 1]) + answer;
                            arr[i] = String.valueOf(answer);
                        }
                        break;
                    case "-":
                        if ((i + 1) <= arr.length - 1) {
                            if ((Objects.equals(arr[i + 1], "/") | Objects.equals(arr[i + 1], "+")
                                    | Objects.equals(arr[i + 1], "-") | Objects.equals(arr[i + 1], "x")) & !s) {
                                s = true;
                                answer = answer - Double.parseDouble(arr[i - 2]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            } else if (s) {
                                answer = Double.parseDouble(arr[buff]) - answer;
                                arr[i] = String.valueOf(answer);
                                buff--;
                                if (!Objects.equals(arr[i + 1], "/") & !Objects.equals(arr[i + 1], "+")
                                        & !Objects.equals(arr[i + 1], "-") & !Objects.equals(arr[i + 1], "x")) {
                                    s = false;
                                }
                            } else {
                                answer = Double.parseDouble(arr[i - 2]) - Double.parseDouble(arr[i - 1]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            }
                        } else if (s) {
                            answer = Double.parseDouble(arr[buff]) - answer;
                            arr[i] = String.valueOf(answer);
                        } else {
                            answer = Double.parseDouble(arr[i - 1]) - answer;
                            arr[i] = String.valueOf(answer);
                        }
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            }
            System.out.println(answer);
        } else {
            System.out.println("Error");
        }
    }
}