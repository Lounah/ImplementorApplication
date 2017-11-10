package reflection;

import implementor.ImplementorException;

public interface ReflectionApi {

    String createClassFromDirectory(final String directoryPath, final String className) throws ImplementorException;

    String createClassFromStandardLibrary(final String className) throws ImplementorException;

}
