
  package gen;
  public class L_Gen185 {
  		@com.google.inject.Inject
  		public L_Gen185(L_Gen186 l_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  