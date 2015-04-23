
  package gen;
  public class V_Gen32 {
  		@com.google.inject.Inject
  		public V_Gen32(V_Gen33 v_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  