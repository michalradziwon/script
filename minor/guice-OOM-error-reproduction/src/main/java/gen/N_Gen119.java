
  package gen;
  public class N_Gen119 {
  		@com.google.inject.Inject
  		public N_Gen119(N_Gen120 n_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  