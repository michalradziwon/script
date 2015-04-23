
  package gen;
  public class V_Gen28 {
  		@com.google.inject.Inject
  		public V_Gen28(V_Gen29 v_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  