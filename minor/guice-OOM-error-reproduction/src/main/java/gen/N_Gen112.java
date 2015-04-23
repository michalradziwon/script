
  package gen;
  public class N_Gen112 {
  		@com.google.inject.Inject
  		public N_Gen112(N_Gen113 n_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  