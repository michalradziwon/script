
  package gen;
  public class N_Gen123 {
  		@com.google.inject.Inject
  		public N_Gen123(N_Gen124 n_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  