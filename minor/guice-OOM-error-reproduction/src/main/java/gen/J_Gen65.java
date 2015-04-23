
  package gen;
  public class J_Gen65 {
  		@com.google.inject.Inject
  		public J_Gen65(J_Gen66 j_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  