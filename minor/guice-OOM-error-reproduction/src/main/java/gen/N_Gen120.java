
  package gen;
  public class N_Gen120 {
  		@com.google.inject.Inject
  		public N_Gen120(N_Gen121 n_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  