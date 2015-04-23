
  package gen;
  public class N_Gen92 {
  		@com.google.inject.Inject
  		public N_Gen92(N_Gen93 n_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  