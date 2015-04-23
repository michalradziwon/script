
  package gen;
  public class L_Gen50 {
  		@com.google.inject.Inject
  		public L_Gen50(L_Gen51 l_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  