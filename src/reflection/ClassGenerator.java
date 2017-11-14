package reflection;

import implementor.ImplementorException;
import reflection.builder.ClassBuilder;
import reflection.resolver.ClassType;
import reflection.resolver.Resolver;

import java.lang.reflect.Method;


public class ClassGenerator implements ReflectionApi {

    private final Resolver classTypeResolver;
    private final ClassBuilder classBuilder;

    public ClassGenerator(final Resolver classTypeResolver, final ClassBuilder classBuilder) {
        this.classTypeResolver = classTypeResolver;
        this.classBuilder = classBuilder;
    }

    @Override
    public String createClassFromDirectory(String directoryPath, String className) throws ImplementorException {

        return null;
    }

    @Override
    public String createClassFromStandardLibrary(String className) throws ImplementorException {
        try {
            Class clazz = Class.forName(className);
            if (classTypeResolver.resolveType(clazz) == ClassType.INTERFACE) {
               
            } else {

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
