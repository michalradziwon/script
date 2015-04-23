
  package gen;
  public class N_Gen28 {
  		@com.google.inject.Inject
  		public N_Gen28(N_Gen29 n_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  