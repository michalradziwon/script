
  package gen;
  public class N_Gen2 {
  		@com.google.inject.Inject
  		public N_Gen2(N_Gen3 n_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  