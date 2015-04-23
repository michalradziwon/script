
  package gen;
  public class V_Gen70 {
  		@com.google.inject.Inject
  		public V_Gen70(V_Gen71 v_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  