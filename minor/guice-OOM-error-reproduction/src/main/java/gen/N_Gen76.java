
  package gen;
  public class N_Gen76 {
  		@com.google.inject.Inject
  		public N_Gen76(N_Gen77 n_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  