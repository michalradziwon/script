
  package gen;
  public class V_Gen145 {
  		@com.google.inject.Inject
  		public V_Gen145(V_Gen146 v_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  