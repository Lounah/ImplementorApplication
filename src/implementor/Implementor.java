package implementor;


public interface Implementor {

    String implementFromDirectory(final String directoryPath, final String className) throws ImplementorException;

    String implementFromStandardLibrary(final String className) throws ImplementorException;

}

