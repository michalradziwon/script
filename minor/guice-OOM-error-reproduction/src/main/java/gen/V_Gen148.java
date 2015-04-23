
  package gen;
  public class V_Gen148 {
  		@com.google.inject.Inject
  		public V_Gen148(V_Gen149 v_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  