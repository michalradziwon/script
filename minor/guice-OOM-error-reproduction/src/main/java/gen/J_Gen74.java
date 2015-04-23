
  package gen;
  public class J_Gen74 {
  		@com.google.inject.Inject
  		public J_Gen74(J_Gen75 j_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  