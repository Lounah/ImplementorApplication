package implementor;


import reflection.ReflectionApi;

public class ImplementorImpl implements Implementor {

    private ReflectionApi reflectionApi;

    public ImplementorImpl(final ReflectionApi reflectionApi) {
        this.reflectionApi = reflectionApi;
    }

    @Override
    public String implementFromDirectory(final String directoryPath, final String className) throws ImplementorException {
        return reflectionApi.createClassFromDirectory(directoryPath, className);
    }

    @Override
    public String implementFromStandardLibrary(final String className) throws ImplementorException {
        return reflectionApi.createClassFromStandardLibrary(className);
    }
}
