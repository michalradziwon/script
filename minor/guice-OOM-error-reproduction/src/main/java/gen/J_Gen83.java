
  package gen;
  public class J_Gen83 {
  		@com.google.inject.Inject
  		public J_Gen83(J_Gen84 j_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  