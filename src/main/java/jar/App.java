package jar;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

@Slf4j
public class App {

    public static void main( String[] args ) throws IOException {
        URI path = new File("inputData.txt").toURI();
        System.out.println(Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8));
        log.info("Info log message TEST");
        log.error("Error log message TEST");
    }
}
