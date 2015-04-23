
  package gen;
  public class N_Gen69 {
  		@com.google.inject.Inject
  		public N_Gen69(N_Gen70 n_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  