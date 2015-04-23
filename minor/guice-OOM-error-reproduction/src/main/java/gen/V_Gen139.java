
  package gen;
  public class V_Gen139 {
  		@com.google.inject.Inject
  		public V_Gen139(V_Gen140 v_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  