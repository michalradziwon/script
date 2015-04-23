
  package gen;
  public class N_Gen185 {
  		@com.google.inject.Inject
  		public N_Gen185(N_Gen186 n_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  