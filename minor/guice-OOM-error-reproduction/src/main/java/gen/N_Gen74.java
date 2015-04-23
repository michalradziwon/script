
  package gen;
  public class N_Gen74 {
  		@com.google.inject.Inject
  		public N_Gen74(N_Gen75 n_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  