
  package gen;
  public class N_Gen132 {
  		@com.google.inject.Inject
  		public N_Gen132(N_Gen133 n_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  