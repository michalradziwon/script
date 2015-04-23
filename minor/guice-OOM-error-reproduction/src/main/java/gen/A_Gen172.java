
  package gen;
  public class A_Gen172 {
  		@com.google.inject.Inject
  		public A_Gen172(A_Gen173 a_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  