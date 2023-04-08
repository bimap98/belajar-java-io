package programmerzamannow.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SmallFileTest {

  @Test
  void writeSmallTest() throws IOException {

    Path small1 = Path.of("small1.txt");
    byte[] bytes = "Hello World".getBytes();
    Files.write(small1, bytes);
    Assertions.assertTrue(Files.exists(small1));

    Path small2 = Path.of("small2.txt");
    Files.writeString(small2, "Hello World");
    Assertions.assertTrue(Files.exists(small2));

  }

  @Test
  void readSmallTest() throws IOException {

    Path small1 = Path.of("small1.txt");
    byte[] bytes = Files.readAllBytes(small1);
    String content1 = new String(bytes);
    Assertions.assertEquals("Hello World", content1);

    Path small2 = Path.of("small2.txt");
    String content2 = Files.readString(small2);
    Assertions.assertEquals("Hello World", content2);

  }
}
