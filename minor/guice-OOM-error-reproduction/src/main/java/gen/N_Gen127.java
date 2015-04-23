
  package gen;
  public class N_Gen127 {
  		@com.google.inject.Inject
  		public N_Gen127(N_Gen128 n_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  