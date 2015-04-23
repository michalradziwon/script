
  package gen;
  public class N_Gen78 {
  		@com.google.inject.Inject
  		public N_Gen78(N_Gen79 n_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  