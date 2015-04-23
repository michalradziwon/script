
  package gen;
  public class N_Gen77 {
  		@com.google.inject.Inject
  		public N_Gen77(N_Gen78 n_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  