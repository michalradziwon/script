
  package gen;
  public class J_Gen76 {
  		@com.google.inject.Inject
  		public J_Gen76(J_Gen77 j_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  