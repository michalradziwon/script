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
    Injector injector = createInjector(new MyModule());
    long stop = System.currentTimeMillis();
    System.out.println(String.format("Injector created in %dms", stop - start));


    A instance = injector.getInstance(A.class);
    System.out.println("Got " + instance);
    injector.getInstance(gen.GenClient.class);
    System.out.println("application was operating for " + (System.currentTimeMillis() - start) + " ms.");



    //application was operating for 5.0/1.7/1.4/1.5/1.5s. FOR 1000k elements
    //application was operating for 3.2/3.0/3.1/3.1/3.1s. FOR 2000k elements
    // for 4K injection could not start (no response -  i have not analysed it yet)



    // for 10K elements:
/*
 * Exception in thread "main" com.google.inject.internal.util.$ComputationException: com.google.inject.internal.util.$ComputationException: java.lang.ArrayIndexOutOfBoundsException: 34601
  at com.google.inject.internal.util.$MapMaker$StrategyImpl.compute(MapMaker.java:553)
  at com.google.inject.internal.util.$MapMaker$StrategyImpl.compute(MapMaker.java:419)
  at com.google.inject.internal.util.$CustomConcurrentHashMap$ComputingImpl.get(CustomConcurrentHashMap.java:2041)
  at com.google.inject.internal.FailableCache.get(FailableCache.java:50)
  at com.google.inject.internal.ConstructorInjectorStore.get(ConstructorInjectorStore.java:49)
  at com.google.inject.internal.ConstructorBindingImpl.initialize(ConstructorBindingImpl.java:125)
  at com.google.inject.internal.InjectorImpl.initializeBinding(InjectorImpl.java:507)
  at com.google.inject.internal.AbstractBindingProcessor$Processor$1.run(AbstractBindingProcessor.java:159)
  at com.google.inject.internal.ProcessedBindingData.initializeBindings(ProcessedBindingData.java:44)
  at com.google.inject.internal.InternalInjectorCreator.initializeStatically(InternalInjectorCreator.java:122)
  at com.google.inject.internal.InternalInjectorCreator.build(InternalInjectorCreator.java:106)
  at Main.createInjector(Main.java:30)
  at Main.main(Main.java:15)
Caused by: com.google.inject.internal.util.$ComputationException: java.lang.ArrayIndexOutOfBoundsException: 34601
  at com.google.inject.internal.util.$MapMaker$StrategyImpl.compute(MapMaker.java:553)
  at com.google.inject.internal.util.$MapMaker$StrategyImpl.compute(MapMaker.java:419)
  at com.google.inject.internal.util.$CustomConcurrentHashMap$ComputingImpl.get(CustomConcurrentHashMap.java:2041)
  at com.google.inject.internal.FailableCache.get(FailableCache.java:50)
  at com.google.inject.internal.MembersInjectorStore.get(MembersInjectorStore.java:65)
  at com.google.inject.internal.ConstructorInjectorStore.createConstructor(ConstructorInjectorStore.java:73)
  at com.google.inject.internal.ConstructorInjectorStore.access$000(ConstructorInjectorStore.java:28)
  at com.google.inject.internal.ConstructorInjectorStore$1.create(ConstructorInjectorStore.java:36)
  at com.google.inject.internal.ConstructorInjectorStore$1.create(ConstructorInjectorStore.java:32)
  at com.google.inject.internal.FailableCache$1.apply(FailableCache.java:39)
  at com.google.inject.internal.util.$MapMaker$StrategyImpl.compute(MapMaker.java:549)
  ... 12 more
Caused by: java.lang.ArrayIndexOutOfBoundsException: 34601
  at com.google.inject.internal.asm.$ClassReader.readClass(Unknown Source)
  at com.google.inject.internal.asm.$ClassReader.accept(Unknown Source)
  at com.google.inject.internal.asm.$ClassReader.accept(Unknown Source)
  at com.google.inject.internal.cglib.core.$ClassNameReader.getClassInfo(ClassNameReader.java:39)
  at com.google.inject.internal.cglib.core.$ClassNameReader.getClassName(ClassNameReader.java:32)
  at com.google.inject.internal.cglib.core.$AbstractClassGenerator.create(AbstractClassGenerator.java:217)
  at com.google.inject.internal.cglib.reflect.$FastClass$Generator.create(FastClass.java:64)
  at com.google.inject.internal.BytecodeGen.newFastClass(BytecodeGen.java:207)
  at com.google.inject.internal.SingleMethodInjector.createMethodInvoker(SingleMethodInjector.java:49)
  at com.google.inject.internal.SingleMethodInjector.<init>(SingleMethodInjector.java:38)
  at com.google.inject.internal.MembersInjectorStore.getInjectors(MembersInjectorStore.java:125)
  at com.google.inject.internal.MembersInjectorStore.createWithListeners(MembersInjectorStore.java:95)
  at com.google.inject.internal.MembersInjectorStore.access$000(MembersInjectorStore.java:34)
  at com.google.inject.internal.MembersInjectorStore$1.create(MembersInjectorStore.java:42)
  at com.google.inject.internal.MembersInjectorStore$1.create(MembersInjectorStore.java:39)
  at com.google.inject.internal.FailableCache$1.apply(FailableCache.java:39)
  at com.google.inject.internal.util.$MapMaker$StrategyImpl.compute(MapMaker.java:549)
  ... 22 more

 */
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
      bind(gen.GenClient.class);
    }
  }
}
