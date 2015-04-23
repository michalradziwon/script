
  package gen;
  public class J_Gen75 {
  		@com.google.inject.Inject
  		public J_Gen75(J_Gen76 j_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  