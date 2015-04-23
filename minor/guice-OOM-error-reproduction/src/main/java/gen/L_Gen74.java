
  package gen;
  public class L_Gen74 {
  		@com.google.inject.Inject
  		public L_Gen74(L_Gen75 l_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  