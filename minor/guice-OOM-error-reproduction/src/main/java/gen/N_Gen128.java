
  package gen;
  public class N_Gen128 {
  		@com.google.inject.Inject
  		public N_Gen128(N_Gen129 n_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  