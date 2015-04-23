
  package gen;
  public class N_Gen88 {
  		@com.google.inject.Inject
  		public N_Gen88(N_Gen89 n_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  