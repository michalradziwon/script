
  package gen;
  public class N_Gen169 {
  		@com.google.inject.Inject
  		public N_Gen169(N_Gen170 n_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  