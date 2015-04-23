
  package gen;
  public class V_Gen130 {
  		@com.google.inject.Inject
  		public V_Gen130(V_Gen131 v_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  