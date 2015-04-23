
  package gen;
  public class J_Gen133 {
  		@com.google.inject.Inject
  		public J_Gen133(J_Gen134 j_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  