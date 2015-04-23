
  package gen;
  public class S_Gen169 {
  		@com.google.inject.Inject
  		public S_Gen169(S_Gen170 s_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  