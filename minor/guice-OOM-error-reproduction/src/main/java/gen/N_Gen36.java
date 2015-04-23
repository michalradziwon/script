
  package gen;
  public class N_Gen36 {
  		@com.google.inject.Inject
  		public N_Gen36(N_Gen37 n_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  