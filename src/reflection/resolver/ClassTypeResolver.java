package reflection.resolver;

public class ClassTypeResolver implements Resolver<ClassType> {
    @Override
    public ClassType resolveType(final Class clazz) {
        if (clazz.isInterface()) return ClassType.INTERFACE; else
            return ClassType.ABSTRACT;
    }
}
