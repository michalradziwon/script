
  package gen;
  public class N_Gen142 {
  		@com.google.inject.Inject
  		public N_Gen142(N_Gen143 n_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  