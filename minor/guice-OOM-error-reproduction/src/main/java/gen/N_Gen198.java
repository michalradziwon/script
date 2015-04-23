
  package gen;
  public class N_Gen198 {
  		@com.google.inject.Inject
  		public N_Gen198(N_Gen199 n_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  