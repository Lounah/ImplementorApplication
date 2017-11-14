package reflection.resolver;

public interface Resolver<T> {

    T resolveType(final Class clazz);

}
