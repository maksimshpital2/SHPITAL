package Task3;

import java.util.regex.Pattern;

import static java.lang.Math.sqrt;

public class Add<T> {
    private String sum;

    Add(T a, T b) {
        sum = a.toString() + " + " + b.toString();
    }

    public String getSum() {
        return sum;
    }

    public double evaluate(int number) {
        Pattern p1 = Pattern.compile("[0-9]");
        Pattern p2 = Pattern.compile("-");
        Pattern p3 = Pattern.compile("\\+");
        Pattern p4 = Pattern.compile("/");
        Pattern p5 = Pattern.compile("\\*");

        Pattern pattern = Pattern.compile(" ");
        String[] words = pattern.split(sum);
        int buff = 0;
        boolean dob = false;
        for (int i = 0; i < words.length; i += 2) {
            if (!p1.matcher(words[i]).matches() & !p2.matcher(words[i]).matches() & !p3.matcher(words[i]).matches() & !p4.matcher(words[i]).matches() & !p5.matcher(words[i]).matches()) {
                if (buff != 0) {
                    dob = true;
                } else {
                    buff = i;
                }
            }
        }
        double answer = 0;
        if (!dob) {
            switch (buff) {
                case 0:
                    if (p2.matcher(words[3]).matches()) {
                        answer = number + Integer.parseInt(words[4]);
                        if (p2.matcher(words[1]).matches()) {
                            answer = answer + Integer.parseInt(words[2]);
                        } else if (p3.matcher(words[1]).matches()) {
                            answer = answer - Integer.parseInt(words[2]);
                        } else if (p4.matcher(words[1]).matches()) {
                            answer = answer * Integer.parseInt(words[2]);
                        } else if (p5.matcher(words[1]).matches()) {
                            answer = answer / Integer.parseInt(words[2]);
                        }
                    } else if (p3.matcher(words[3]).matches()) {
                        answer = number - Integer.parseInt(words[4]);
                        if (p2.matcher(words[1]).matches()) {
                            answer = answer + Integer.parseInt(words[2]);
                        } else if (p3.matcher(words[1]).matches()) {
                            answer = answer - Integer.parseInt(words[2]);
                        } else if (p4.matcher(words[1]).matches()) {
                            answer = answer * Integer.parseInt(words[2]);
                        } else if (p5.matcher(words[1]).matches()) {
                            answer = answer / Integer.parseInt(words[2]);
                        }
                    } else if (p4.matcher(words[3]).matches()) {
                        answer = number * Integer.parseInt(words[4]);
                        if (p2.matcher(words[1]).matches()) {
                            answer = answer + Integer.parseInt(words[2]);
                        } else if (p3.matcher(words[1]).matches()) {
                            answer = answer - Integer.parseInt(words[2]);
                        } else if (p4.matcher(words[1]).matches()) {
                            answer = answer * Integer.parseInt(words[2]);
                        } else if (p5.matcher(words[1]).matches()) {
                            answer = answer / Integer.parseInt(words[2]);
                        }
                    } else if (p5.matcher(words[3]).matches()) {
                        answer = number / Integer.parseInt(words[4]);
                        if (p2.matcher(words[1]).matches()) {
                            answer = answer + Integer.parseInt(words[2]);
                        } else if (p3.matcher(words[1]).matches()) {
                            answer = answer - Integer.parseInt(words[2]);
                        } else if (p4.matcher(words[1]).matches()) {
                            answer = answer * Integer.parseInt(words[2]);
                        } else if (p5.matcher(words[1]).matches()) {
                            answer = answer / Integer.parseInt(words[2]);
                        }
                    }
                    break;
                case 2:
                    if (p2.matcher(words[3]).matches()) {
                        answer = number + Integer.parseInt(words[4]);
                        if (p2.matcher(words[1]).matches()) {
                            answer = answer + Integer.parseInt(words[0]);
                        } else if (p3.matcher(words[1]).matches()) {
                            answer = answer - Integer.parseInt(words[0]);
                        } else if (p4.matcher(words[1]).matches()) {
                            answer = answer * Integer.parseInt(words[0]);
                        } else if (p5.matcher(words[1]).matches()) {
                            answer = answer / Integer.parseInt(words[0]);
                        }
                    } else if (p3.matcher(words[3]).matches()) {
                        answer = number - Integer.parseInt(words[4]);
                        if (p2.matcher(words[1]).matches()) {
                            answer = answer + Integer.parseInt(words[0]);
                        } else if (p3.matcher(words[1]).matches()) {
                            answer = answer - Integer.parseInt(words[0]);
                        } else if (p4.matcher(words[1]).matches()) {
                            answer = answer * Integer.parseInt(words[0]);
                        } else if (p5.matcher(words[1]).matches()) {
                            answer = answer / Integer.parseInt(words[0]);
                        }
                    } else if (p4.matcher(words[3]).matches()) {
                        answer = number * Integer.parseInt(words[0]);
                        if (p2.matcher(words[3]).matches()) {
                            answer = answer + Integer.parseInt(words[4]);
                        } else if (p3.matcher(words[3]).matches()) {
                            answer = answer - Integer.parseInt(words[4]);
                        } else if (p4.matcher(words[3]).matches()) {
                            answer = answer * Integer.parseInt(words[4]);
                        } else if (p5.matcher(words[3]).matches()) {
                            answer = answer / Integer.parseInt(words[4]);
                        }
                    } else if (p5.matcher(words[3]).matches()) {
                        answer = number / Integer.parseInt(words[0]);
                        if (p2.matcher(words[3]).matches()) {
                            answer = answer + Integer.parseInt(words[4]);
                        } else if (p3.matcher(words[3]).matches()) {
                            answer = answer - Integer.parseInt(words[4]);
                        } else if (p4.matcher(words[3]).matches()) {
                            answer = answer * Integer.parseInt(words[4]);
                        } else if (p5.matcher(words[3]).matches()) {
                            answer = answer / Integer.parseInt(words[4]);
                        }
                    }
                    break;
                case 4:
                    if (p2.matcher(words[1]).matches()) {
                        answer = number + Integer.parseInt(words[0]);
                    } else if (p3.matcher(words[1]).matches()) {
                        if (p2.matcher(words[3]).matches()) {
                            answer = answer + Integer.parseInt(words[2]);
                        } else if (p3.matcher(words[3]).matches()) {
                            answer = answer - Integer.parseInt(words[2]);
                        } else if (p4.matcher(words[3]).matches()) {
                            answer = answer * Integer.parseInt(words[2]);
                        } else if (p5.matcher(words[3]).matches()) {
                            answer = answer / Integer.parseInt(words[2]);
                        }
                    } else if (p3.matcher(words[1]).matches()) {
                        answer = number - Integer.parseInt(words[0]);
                        if (p2.matcher(words[3]).matches()) {
                            answer = answer + Integer.parseInt(words[2]);
                        } else if (p3.matcher(words[3]).matches()) {
                            answer = answer - Integer.parseInt(words[2]);
                        } else if (p4.matcher(words[3]).matches()) {
                            answer = answer * Integer.parseInt(words[2]);
                        } else if (p5.matcher(words[3]).matches()) {
                            answer = answer / Integer.parseInt(words[2]);
                        }
                    } else if (p4.matcher(words[1]).matches()) {
                        answer = number * Integer.parseInt(words[0]);
                        if (p2.matcher(words[3]).matches()) {
                            answer = answer + Integer.parseInt(words[2]);
                        } else if (p3.matcher(words[3]).matches()) {
                            answer = answer - Integer.parseInt(words[2]);
                        } else if (p4.matcher(words[3]).matches()) {
                            answer = answer * Integer.parseInt(words[2]);
                        } else if (p5.matcher(words[3]).matches()) {
                            answer = answer / Integer.parseInt(words[2]);
                        }
                    } else if (p5.matcher(words[1]).matches()) {
                        answer = number / Integer.parseInt(words[0]);
                        if (p2.matcher(words[3]).matches()) {
                            answer = answer + Integer.parseInt(words[2]);
                        } else if (p3.matcher(words[3]).matches()) {
                            answer = answer - Integer.parseInt(words[2]);
                        } else if (p4.matcher(words[3]).matches()) {
                            answer = answer * Integer.parseInt(words[2]);
                        } else if (p5.matcher(words[3]).matches()) {
                            answer = answer / Integer.parseInt(words[2]);
                        }
                    }
                    break;
            }
        } else {
            double d = 0;
            boolean s = false;
            double answer1 = 0;
            if (p1.matcher(words[0]).matches()) {
                s = true;
                if (p2.matcher(words[9]).matches()) {
                    d = Integer.parseInt(words[6]) * Integer.parseInt(words[6]) + 4 * Integer.parseInt(words[0]) * Integer.parseInt(words[10]);
                } else {
                    d = Integer.parseInt(words[6]) * Integer.parseInt(words[6]) - 4 * Integer.parseInt(words[0]) * Integer.parseInt(words[10]);
                }
            } else {
                if (p2.matcher(words[7]).matches()) {
                    d = Integer.parseInt(words[4]) * Integer.parseInt(words[4]) + 4 * Integer.parseInt(words[8]);
                } else {
                    d = Integer.parseInt(words[4]) * Integer.parseInt(words[4]) - 4 * Integer.parseInt(words[8]);
                }
            }
            if (d >= 0) {
                if (s) {
                    if (p2.matcher(words[5]).matches()) {
                        answer = (Integer.parseInt(words[6]) + sqrt(d)) / Integer.parseInt(words[0]) * 2;
                        answer1 = (Integer.parseInt(words[6]) - sqrt(d)) / Integer.parseInt(words[0]) * 2;
                    } else {
                        answer = (Integer.parseInt(words[6]) * (-1) + sqrt(d)) / Integer.parseInt(words[0]) * 2;
                        answer1 = (Integer.parseInt(words[6]) * (-1) - sqrt(d)) / Integer.parseInt(words[0]) * 2;
                    }
                } else {
                    if (p2.matcher(words[3]).matches()) {
                        answer = (Integer.parseInt(words[4]) + sqrt(d)) / 2;
                        answer1 = (Integer.parseInt(words[4]) - sqrt(d)) / 2;
                    } else {
                        answer = (Integer.parseInt(words[4]) * (-1) + sqrt(d)) / 2;
                        answer1 = (Integer.parseInt(words[4]) * (-1) - sqrt(d)) / 2;
                    }
                }
            } else {
                System.out.println("Нет действительных корней");
            }
            System.out.println(answer1 + " " + answer);
            return answer1 + answer;
        }
        System.out.println(answer);
        return answer;
    }

    @Override
    public String toString() {
        return sum;
    }
}
