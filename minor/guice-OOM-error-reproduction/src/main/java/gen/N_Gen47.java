
  package gen;
  public class N_Gen47 {
  		@com.google.inject.Inject
  		public N_Gen47(N_Gen48 n_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  