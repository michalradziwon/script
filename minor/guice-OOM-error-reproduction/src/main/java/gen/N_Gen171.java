
  package gen;
  public class N_Gen171 {
  		@com.google.inject.Inject
  		public N_Gen171(N_Gen172 n_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  