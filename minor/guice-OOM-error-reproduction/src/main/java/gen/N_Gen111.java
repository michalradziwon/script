
  package gen;
  public class N_Gen111 {
  		@com.google.inject.Inject
  		public N_Gen111(N_Gen112 n_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  