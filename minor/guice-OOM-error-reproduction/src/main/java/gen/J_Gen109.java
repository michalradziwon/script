
  package gen;
  public class J_Gen109 {
  		@com.google.inject.Inject
  		public J_Gen109(J_Gen110 j_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  