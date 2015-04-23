
  package gen;
  public class A_Gen81 {
  		@com.google.inject.Inject
  		public A_Gen81(A_Gen82 a_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  