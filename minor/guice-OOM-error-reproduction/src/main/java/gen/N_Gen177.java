
  package gen;
  public class N_Gen177 {
  		@com.google.inject.Inject
  		public N_Gen177(N_Gen178 n_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  