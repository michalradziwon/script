
  package gen;
  public class V_Gen111 {
  		@com.google.inject.Inject
  		public V_Gen111(V_Gen112 v_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  