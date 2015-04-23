
  package gen;
  public class V_Gen185 {
  		@com.google.inject.Inject
  		public V_Gen185(V_Gen186 v_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  