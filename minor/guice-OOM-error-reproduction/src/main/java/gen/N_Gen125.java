
  package gen;
  public class N_Gen125 {
  		@com.google.inject.Inject
  		public N_Gen125(N_Gen126 n_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  