
  package gen;
  public class N_Gen155 {
  		@com.google.inject.Inject
  		public N_Gen155(N_Gen156 n_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  