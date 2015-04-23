
  package gen;
  public class V_Gen50 {
  		@com.google.inject.Inject
  		public V_Gen50(V_Gen51 v_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  