
  package gen;
  public class V_Gen131 {
  		@com.google.inject.Inject
  		public V_Gen131(V_Gen132 v_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  