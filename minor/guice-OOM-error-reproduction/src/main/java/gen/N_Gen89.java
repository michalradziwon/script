
  package gen;
  public class N_Gen89 {
  		@com.google.inject.Inject
  		public N_Gen89(N_Gen90 n_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  