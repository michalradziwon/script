
  package gen;
  public class V_Gen196 {
  		@com.google.inject.Inject
  		public V_Gen196(V_Gen197 v_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  