package Task1;

abstract class TestAuthor {
    public static void main(String[] args) {
        Author andrew = new Author("������", "andrew@9509529898.ru", '�');

        System.out.println(andrew);
        System.out.println(andrew.getName());
        System.out.println(andrew.getEmail());
        System.out.println(andrew.getGender());
        andrew.setEmail("andrew@jji.ru");
    }
}