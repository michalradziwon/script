
  package gen;
  public class V_Gen74 {
  		@com.google.inject.Inject
  		public V_Gen74(V_Gen75 v_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  