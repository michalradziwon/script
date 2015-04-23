
  package gen;
  public class N_Gen62 {
  		@com.google.inject.Inject
  		public N_Gen62(N_Gen63 n_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  