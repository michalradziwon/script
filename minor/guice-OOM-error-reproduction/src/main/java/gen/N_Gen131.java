
  package gen;
  public class N_Gen131 {
  		@com.google.inject.Inject
  		public N_Gen131(N_Gen132 n_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  