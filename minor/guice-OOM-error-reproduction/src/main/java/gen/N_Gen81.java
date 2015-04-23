
  package gen;
  public class N_Gen81 {
  		@com.google.inject.Inject
  		public N_Gen81(N_Gen82 n_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  