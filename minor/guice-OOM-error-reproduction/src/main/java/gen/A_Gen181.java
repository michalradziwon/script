
  package gen;
  public class A_Gen181 {
  		@com.google.inject.Inject
  		public A_Gen181(A_Gen182 a_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  