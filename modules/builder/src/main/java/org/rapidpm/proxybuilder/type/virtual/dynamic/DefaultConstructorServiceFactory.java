package org.rapidpm.proxybuilder.type.virtual.dynamic;


/**
 * Created by svenruppert on 22.07.15.
 */
public class DefaultConstructorServiceFactory<C> implements VirtualDynamicProxyInvocationHandler.ServiceFactory<C> {


  private Class<C> realClass;

  public DefaultConstructorServiceFactory(final Class<C> realClass) {
    this.realClass = realClass;
  }

  @Override
  public C createInstance() {
    C newInstance = null;
    try {
      newInstance = realClass.newInstance();
    } catch (InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    }
    return newInstance;
  }
}
