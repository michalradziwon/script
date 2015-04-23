
  package gen;
  public class N_Gen121 {
  		@com.google.inject.Inject
  		public N_Gen121(N_Gen122 n_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  