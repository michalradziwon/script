
  package gen;
  public class N_Gen16 {
  		@com.google.inject.Inject
  		public N_Gen16(N_Gen17 n_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  