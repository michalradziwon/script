
  package gen;
  public class V_Gen187 {
  		@com.google.inject.Inject
  		public V_Gen187(V_Gen188 v_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  