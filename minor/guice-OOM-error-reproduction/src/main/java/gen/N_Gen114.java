
  package gen;
  public class N_Gen114 {
  		@com.google.inject.Inject
  		public N_Gen114(N_Gen115 n_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  