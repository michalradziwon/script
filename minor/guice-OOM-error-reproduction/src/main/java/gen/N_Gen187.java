
  package gen;
  public class N_Gen187 {
  		@com.google.inject.Inject
  		public N_Gen187(N_Gen188 n_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  