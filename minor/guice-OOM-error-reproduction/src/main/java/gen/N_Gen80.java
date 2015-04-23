
  package gen;
  public class N_Gen80 {
  		@com.google.inject.Inject
  		public N_Gen80(N_Gen81 n_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  