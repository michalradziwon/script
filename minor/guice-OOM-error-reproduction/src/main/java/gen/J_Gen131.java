
  package gen;
  public class J_Gen131 {
  		@com.google.inject.Inject
  		public J_Gen131(J_Gen132 j_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  