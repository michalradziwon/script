
  package gen;
  public class N_Gen145 {
  		@com.google.inject.Inject
  		public N_Gen145(N_Gen146 n_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  