
  package gen;
  public class N_Gen134 {
  		@com.google.inject.Inject
  		public N_Gen134(N_Gen135 n_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  