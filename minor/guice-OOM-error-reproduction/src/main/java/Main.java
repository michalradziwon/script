import gen.A;

import java.util.Arrays;

import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Stage;
import com.google.inject.internal.InternalInjectorCreator;

public class Main {
  public static void main(String[] args) {
    System.out.println("Creating injector...");
    long start = System.currentTimeMillis();
    Injector createInjector = createInjector(new MyModule());
    long stop = System.currentTimeMillis();
    System.out.println(String.format("Injector created in %dms", stop - start));


    A instance = createInjector.getInstance(A.class);
    System.out.println("Got " + instance);
  }

  public static Injector createInjector(Module... modules) {
    InternalInjectorCreator internalInjectorCreator = new InternalInjectorCreator().stage(Stage.DEVELOPMENT).addModules(
      Arrays.asList(modules));
    return internalInjectorCreator.build();
  }

  private static class MyModule extends AbstractModule {
    @Override
    protected void configure() {
      bind(A.class);
    }
  }
}
