
  package gen;
  public class V_Gen129 {
  		@com.google.inject.Inject
  		public V_Gen129(V_Gen130 v_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  