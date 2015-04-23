
  package gen;
  public class N_Gen183 {
  		@com.google.inject.Inject
  		public N_Gen183(N_Gen184 n_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  