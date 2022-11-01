package Task1;

abstract class TestAuthor {
    public static void main(String[] args) {
        Author andrew = new Author("Андрей", "andrew@9509529898.ru", 'м');

        System.out.println(andrew);
        System.out.println(andrew.getName());
        System.out.println(andrew.getEmail());
        System.out.println(andrew.getGender());
        andrew.setEmail("andrew@jji.ru");
    }
}