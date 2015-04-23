
  package gen;
  public class N_Gen12 {
  		@com.google.inject.Inject
  		public N_Gen12(N_Gen13 n_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  