
  package gen;
  public class V_Gen109 {
  		@com.google.inject.Inject
  		public V_Gen109(V_Gen110 v_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  