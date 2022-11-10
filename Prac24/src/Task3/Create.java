package Task3;

import java.util.Objects;
import java.util.regex.Pattern;

public class Create implements ICreateDocument {
    IDocument[] files;
    int size = 0;

    Create() {
        size++;
        files = new IDocument[size];
    }

    @Override
    public IDocument CreateNew(String string) {
        Pattern pattern = Pattern.compile("\\.");
        String[] words = pattern.split(string);
        if (Objects.equals(string, words[0] + words[1])) {
            System.out.println("Неправильное название типа файла");
            return null;
        } else {
            switch (words[1]) {
                case "txt":
                    files[size - 1] = new TextDocument(string);
                    return new TextDocument(string);
                case "mp3":
                    files[size - 1] = new MusicDocument(string);
                    return new MusicDocument(string);
                case "jpg":
                    files[size - 1] = new ImageDocument(string);
                    return new ImageDocument(string);
            }
        }
        return null;
    }

    @Override
    public IDocument CreateOpen(String string) {
        for (IDocument file : files) {
            if (Objects.equals(file.getString(), string)) {
                return file;
            }
        }
        System.out.println("Файла с таким именем не существует");
        return null;
    }
}