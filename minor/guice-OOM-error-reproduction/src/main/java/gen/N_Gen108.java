
  package gen;
  public class N_Gen108 {
  		@com.google.inject.Inject
  		public N_Gen108(N_Gen109 n_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  