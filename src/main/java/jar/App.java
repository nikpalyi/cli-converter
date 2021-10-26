package jar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Reading input file to an executable running JAR
 * https://stackoverflow.com/a/27662742/11889789
 */

public class App {

     private static Logger log = LogManager.getLogger(App.class);

    public static void main( String[] args ) throws IOException {
        URI path = new File("inputData.txt").toURI();
        System.out.println(Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8));
        log.info("Info log message TEST");
        log.error("Error log message TEST");
    }
}
