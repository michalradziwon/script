
  package gen;
  public class J_Gen169 {
  		@com.google.inject.Inject
  		public J_Gen169(J_Gen170 j_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  