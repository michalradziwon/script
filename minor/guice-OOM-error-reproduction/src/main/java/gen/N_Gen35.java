
  package gen;
  public class N_Gen35 {
  		@com.google.inject.Inject
  		public N_Gen35(N_Gen36 n_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  