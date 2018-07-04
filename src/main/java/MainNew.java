import java.io.IOException;
import java.util.Properties;

@Cfg
public class MainNew {
    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        Properties properties = parser.parse(MainNew.class, "Cfg");
    }
}
