
  package gen;
  public class N_Gen122 {
  		@com.google.inject.Inject
  		public N_Gen122(N_Gen123 n_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  