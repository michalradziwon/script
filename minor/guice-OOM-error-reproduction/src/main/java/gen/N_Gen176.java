
  package gen;
  public class N_Gen176 {
  		@com.google.inject.Inject
  		public N_Gen176(N_Gen177 n_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  