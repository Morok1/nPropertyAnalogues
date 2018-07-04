import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Properties;

public class Parser {
    public Parser() {
    }

    public Properties parse(Object object, String annotationName) throws IOException {
        boolean flag = object instanceof Class;
        if(!flag)
            throw new IllegalArgumentException("Object is not a class");
        if (getAnnotation(object, annotationName)) {
            return getProperties();

        }
        return null;
    }

    public Properties parse(Object object, String path, String annotationName) {
        boolean flag = object instanceof Class;
        if(!flag){
            throw new IllegalArgumentException("WrongType");
        }
        BufferedInputStream

        return null;
    }

    public boolean getAnnotation(Object object, String annotationName) throws IOException {
        Annotation[] annotations = object.getClass().getAnnotations();
        Annotation annotation1 = null;
        for (Annotation annotation : annotations) {
            if(annotation.getClass().getName().equals(annotationName)){
                annotation1 = annotation; 
            }
        }
//        Annotation annotation = Arrays.stream(annotations).filter(s -> s.equals(annotationName)).findFirst().get();
        if(annotation1.getClass().getName().equals(annotationName)){
            return true;

        }
        return false;
    }

    public Properties getProperties() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Smagin1-EN\\Учёба\\java_project\\src\\main\\resources\\config.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        Properties properties1 = new Properties(properties);
        return properties1;
    }



}
