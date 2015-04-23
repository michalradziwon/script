
  package gen;
  public class N_Gen64 {
  		@com.google.inject.Inject
  		public N_Gen64(N_Gen65 n_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  