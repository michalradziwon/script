
  package gen;
  public class N_Gen46 {
  		@com.google.inject.Inject
  		public N_Gen46(N_Gen47 n_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  