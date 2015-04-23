
  package gen;
  public class N_Gen56 {
  		@com.google.inject.Inject
  		public N_Gen56(N_Gen57 n_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  