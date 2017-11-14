import implementor.Implementor;
import implementor.ImplementorException;
import implementor.ImplementorImpl;
import reflection.ClassGenerator;
import reflection.ReflectionApi;
import reflection.builder.ClassBuilder;
import reflection.resolver.ClassTypeResolver;


public class Application  {

    private static final Implementor implementor;
    private static final ReflectionApi classGenerator;
    private static final ClassTypeResolver classTypeResolver;
    private static final ClassBuilder classBuilder;

    private static final String directoryPath = "";
    private static final String className = "implementor.Implementor";

    static {
        classTypeResolver = new ClassTypeResolver();
        classBuilder = new ClassBuilder();
        classGenerator = new ClassGenerator(classTypeResolver, classBuilder);
        implementor = new ImplementorImpl(classGenerator);
    }

    public static void main(String... args) {

        try {
            implementor.implementFromStandardLibrary(className);
        } catch (ImplementorException e) {
            e.printStackTrace();
        }
    }

}
