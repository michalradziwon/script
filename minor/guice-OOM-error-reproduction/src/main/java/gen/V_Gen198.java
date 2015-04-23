
  package gen;
  public class V_Gen198 {
  		@com.google.inject.Inject
  		public V_Gen198(V_Gen199 v_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  