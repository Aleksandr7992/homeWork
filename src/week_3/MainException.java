package week_3;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;


class HandlerException extends RuntimeException{
    public HandlerException(String m, Throwable ex){
        super(m, ex);
    }
}

class FileNew {
    private final Path filePath;

    public FileNew(String filePath) {
        this.filePath = Path.of(filePath);
    }

    public  void writeFile(String data) throws HandlerException {
        try {
            Files.writeString(filePath, data, StandardCharsets.UTF_8, StandardOpenOption.CREATE); // Added charset
            System.out.println("Данные успешно записаны в файл " + filePath);
        } catch (IOException e) {
            throw new HandlerException("Ошибка записи в файл " + filePath, e);
        }
    }

    public List<String> readFile() throws HandlerException{
        try{
            List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            System.out.println("Данные успешно прочитаны из файла " + filePath);
            return lines;
        } catch (NoSuchFileException e){
            throw new HandlerException("Файл не найден", e);
        } catch (IOException e){
            throw new HandlerException("Ошибка при чтении файла " + filePath, e);
        }
    }
}

public class MainException {
    public static void main(String[] args) {
        String dataToWrite = "Данные для записи в файл... ";
        String filePath = "test1.txt";
        FileNew fileNew = new FileNew(filePath);
        try{
            fileNew.writeFile(dataToWrite);
            List<String> lines = fileNew.readFile();
            System.out.println("Содержимое файла:  ");
            lines.stream()
                    .forEach(System.out::println);
        } catch (HandlerException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}