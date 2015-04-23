
  package gen;
  public class N_Gen184 {
  		@com.google.inject.Inject
  		public N_Gen184(N_Gen185 n_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  