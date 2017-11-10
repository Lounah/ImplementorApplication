package implementor;


import reflection.ReflectionApi;

public class ImplementorImpl implements Implementor {

    private ReflectionApi reflectionApi;

    public ImplementorImpl(final ReflectionApi reflectionApi) {
        this.reflectionApi = reflectionApi;
    }

    @Override
    public String implementFromDirectory(String directoryPath, String className) throws ImplementorException {
        return reflectionApi.createClassFromDirectory(directoryPath, className);
    }

    @Override
    public String implementFromStandardLibrary(String className) throws ImplementorException {
        return reflectionApi.createClassFromStandardLibrary(className);
    }
}
