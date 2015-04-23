
  package gen;
  public class V_Gen103 {
  		@com.google.inject.Inject
  		public V_Gen103(V_Gen104 v_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  