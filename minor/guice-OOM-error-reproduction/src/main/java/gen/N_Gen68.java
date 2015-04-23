
  package gen;
  public class N_Gen68 {
  		@com.google.inject.Inject
  		public N_Gen68(N_Gen69 n_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  