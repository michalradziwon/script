
  package gen;
  public class N_Gen141 {
  		@com.google.inject.Inject
  		public N_Gen141(N_Gen142 n_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  