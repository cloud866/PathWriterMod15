import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\resources\\task.txt"); // берем существующий файл
        List<String> contents = Files.readAllLines(path); // читаем в лист в память программы

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("C:\\resources\\task-reversed.txt"))) { // пишем в новый файл
            for (int index = contents.size() - 1; index >= 0; index--) { // создаем цикл с обратным порядком
                writer.write(contents.get(index));
                writer.write("\n"); // не забываем про перенос строки
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}