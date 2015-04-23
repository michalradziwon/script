
  package gen;
  public class N_Gen40 {
  		@com.google.inject.Inject
  		public N_Gen40(N_Gen41 n_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  