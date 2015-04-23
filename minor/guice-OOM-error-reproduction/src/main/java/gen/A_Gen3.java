
  package gen;
  public class A_Gen3 {
  		@com.google.inject.Inject
  		public A_Gen3(A_Gen4 a_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  