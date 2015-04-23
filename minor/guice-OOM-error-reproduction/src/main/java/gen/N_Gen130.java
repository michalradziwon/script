
  package gen;
  public class N_Gen130 {
  		@com.google.inject.Inject
  		public N_Gen130(N_Gen131 n_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  