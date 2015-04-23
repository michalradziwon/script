
  package gen;
  public class A_Gen195 {
  		@com.google.inject.Inject
  		public A_Gen195(A_Gen196 a_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  