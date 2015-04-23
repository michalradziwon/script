
  package gen;
  public class V_Gen160 {
  		@com.google.inject.Inject
  		public V_Gen160(V_Gen161 v_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  