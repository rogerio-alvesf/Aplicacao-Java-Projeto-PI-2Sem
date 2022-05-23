package infrastructure;

import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class GravacaoLogs {

    public static void teste(String teste) throws IOException {
        File arquivo = new File("logs.txt");

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        List<String> lista = new ArrayList<>();
        lista.add(teste);

        Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.APPEND);
    }
}
