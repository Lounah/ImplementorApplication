import implementor.Implementor;
import implementor.ImplementorException;
import implementor.ImplementorImpl;
import reflection.ClassGenerator;
import reflection.ReflectionApi;

import java.util.Map;

public class Application  {

    private static final Implementor implementor;
    private static final ReflectionApi classGenerator;

    private static final String directoryPath = "";
    private static final String className = "";

    static {
        classGenerator = new ClassGenerator();
        implementor = new ImplementorImpl(classGenerator);
    }

    public static void main(String... args) {
        try {
            implementor.implementFromDirectory(directoryPath, className);
        } catch (ImplementorException e) {
            e.printStackTrace();
        }

        try {
            implementor.implementFromStandardLibrary(className);
        } catch (ImplementorException e) {
            e.printStackTrace();
        }
    }

}
