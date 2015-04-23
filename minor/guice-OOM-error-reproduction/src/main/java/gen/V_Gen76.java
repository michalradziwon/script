
  package gen;
  public class V_Gen76 {
  		@com.google.inject.Inject
  		public V_Gen76(V_Gen77 v_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  