
  package gen;
  public class P_Gen50 {
  		@com.google.inject.Inject
  		public P_Gen50(P_Gen51 p_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  