
  package gen;
  public class H_Gen169 {
  		@com.google.inject.Inject
  		public H_Gen169(H_Gen170 h_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  