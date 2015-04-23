
  package gen;
  public class V_Gen88 {
  		@com.google.inject.Inject
  		public V_Gen88(V_Gen89 v_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  