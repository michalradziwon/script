
  package gen;
  public class N_Gen83 {
  		@com.google.inject.Inject
  		public N_Gen83(N_Gen84 n_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  