
  package gen;
  public class N_Gen37 {
  		@com.google.inject.Inject
  		public N_Gen37(N_Gen38 n_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  