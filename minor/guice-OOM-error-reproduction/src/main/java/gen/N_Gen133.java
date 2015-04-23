
  package gen;
  public class N_Gen133 {
  		@com.google.inject.Inject
  		public N_Gen133(N_Gen134 n_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  