
  package gen;
  public class N_Gen139 {
  		@com.google.inject.Inject
  		public N_Gen139(N_Gen140 n_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  