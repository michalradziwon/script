
  package gen;
  public class V_Gen117 {
  		@com.google.inject.Inject
  		public V_Gen117(V_Gen118 v_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  