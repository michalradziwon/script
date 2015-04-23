
  package gen;
  public class N_Gen65 {
  		@com.google.inject.Inject
  		public N_Gen65(N_Gen66 n_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  