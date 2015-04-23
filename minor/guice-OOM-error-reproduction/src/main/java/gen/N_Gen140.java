
  package gen;
  public class N_Gen140 {
  		@com.google.inject.Inject
  		public N_Gen140(N_Gen141 n_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  