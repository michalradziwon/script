
  package gen;
  public class A_Gen165 {
  		@com.google.inject.Inject
  		public A_Gen165(A_Gen166 a_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  