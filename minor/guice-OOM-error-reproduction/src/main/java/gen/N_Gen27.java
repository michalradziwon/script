
  package gen;
  public class N_Gen27 {
  		@com.google.inject.Inject
  		public N_Gen27(N_Gen28 n_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  