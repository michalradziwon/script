
  package gen;
  public class J_Gen47 {
  		@com.google.inject.Inject
  		public J_Gen47(J_Gen48 j_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  