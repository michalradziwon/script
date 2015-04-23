
  package gen;
  public class N_Gen172 {
  		@com.google.inject.Inject
  		public N_Gen172(N_Gen173 n_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  