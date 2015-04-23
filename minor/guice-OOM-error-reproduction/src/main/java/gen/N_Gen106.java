
  package gen;
  public class N_Gen106 {
  		@com.google.inject.Inject
  		public N_Gen106(N_Gen107 n_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  