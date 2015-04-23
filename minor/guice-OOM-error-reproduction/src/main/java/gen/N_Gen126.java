
  package gen;
  public class N_Gen126 {
  		@com.google.inject.Inject
  		public N_Gen126(N_Gen127 n_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  