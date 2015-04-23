
  package gen;
  public class N_Gen75 {
  		@com.google.inject.Inject
  		public N_Gen75(N_Gen76 n_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  