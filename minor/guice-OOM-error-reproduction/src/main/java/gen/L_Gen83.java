
  package gen;
  public class L_Gen83 {
  		@com.google.inject.Inject
  		public L_Gen83(L_Gen84 l_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  