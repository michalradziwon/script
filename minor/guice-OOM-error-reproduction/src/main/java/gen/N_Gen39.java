
  package gen;
  public class N_Gen39 {
  		@com.google.inject.Inject
  		public N_Gen39(N_Gen40 n_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  