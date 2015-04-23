
  package gen;
  public class N_Gen147 {
  		@com.google.inject.Inject
  		public N_Gen147(N_Gen148 n_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  