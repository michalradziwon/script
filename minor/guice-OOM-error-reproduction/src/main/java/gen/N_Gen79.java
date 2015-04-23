
  package gen;
  public class N_Gen79 {
  		@com.google.inject.Inject
  		public N_Gen79(N_Gen80 n_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  