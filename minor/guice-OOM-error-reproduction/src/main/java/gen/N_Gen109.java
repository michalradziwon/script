
  package gen;
  public class N_Gen109 {
  		@com.google.inject.Inject
  		public N_Gen109(N_Gen110 n_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  