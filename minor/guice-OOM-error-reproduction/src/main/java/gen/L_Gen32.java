
  package gen;
  public class L_Gen32 {
  		@com.google.inject.Inject
  		public L_Gen32(L_Gen33 l_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  