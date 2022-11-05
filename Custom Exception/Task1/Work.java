package Task1;

import java.util.Objects;
import java.util.Scanner;

public class Work {
    private String fullname;
    private String inn;

    Work(String fullname, String inn) {
        this.fullname = fullname;
        this.inn = inn;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setInn() throws InnisWrongexception {
        Scanner scanner = new Scanner(System.in);
        try {
            this.inn = scanner.next();
            System.out.println("��������� ���");
            if (!Objects.equals(this.inn, "123456789012")) {
                System.out.println("��� ��������");
            } else {
                throw new InnisWrongexception("��� ������ ��������");
            }
        } catch (Exception e) {
            System.out.println(" ");
        } finally {
            scanner.close();
        }
    }

    public String getFullname() {
        return fullname;
    }

    public String getInn() {
        return inn;
    }
}