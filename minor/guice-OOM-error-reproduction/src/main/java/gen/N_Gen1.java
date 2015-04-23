
  package gen;
  public class N_Gen1 {
  		@com.google.inject.Inject
  		public N_Gen1(N_Gen2 n_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  