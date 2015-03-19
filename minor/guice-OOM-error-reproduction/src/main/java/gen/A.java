package gen;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class A {

  public A(){
  }

  @Inject
  void inject(B b, IC c){
  }

}
