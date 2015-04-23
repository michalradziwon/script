
  package gen;
  public class L_Gen109 {
  		@com.google.inject.Inject
  		public L_Gen109(L_Gen110 l_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  