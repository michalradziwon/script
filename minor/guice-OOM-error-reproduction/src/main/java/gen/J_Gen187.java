
  package gen;
  public class J_Gen187 {
  		@com.google.inject.Inject
  		public J_Gen187(J_Gen188 j_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  