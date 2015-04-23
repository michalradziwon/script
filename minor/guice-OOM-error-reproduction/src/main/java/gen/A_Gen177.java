
  package gen;
  public class A_Gen177 {
  		@com.google.inject.Inject
  		public A_Gen177(A_Gen178 a_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  