
  package gen;
  public class N_Gen199 {
  		@com.google.inject.Inject
  		public N_Gen199(N_Gen200 n_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  