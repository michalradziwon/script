
  package gen;
  public class N_Gen138 {
  		@com.google.inject.Inject
  		public N_Gen138(N_Gen139 n_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  