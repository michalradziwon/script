
  package gen;
  public class V_Gen120 {
  		@com.google.inject.Inject
  		public V_Gen120(V_Gen121 v_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  