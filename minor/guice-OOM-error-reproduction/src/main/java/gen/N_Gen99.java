
  package gen;
  public class N_Gen99 {
  		@com.google.inject.Inject
  		public N_Gen99(N_Gen100 n_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  