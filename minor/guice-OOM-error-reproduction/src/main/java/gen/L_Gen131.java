
  package gen;
  public class L_Gen131 {
  		@com.google.inject.Inject
  		public L_Gen131(L_Gen132 l_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  