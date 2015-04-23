
  package gen;
  public class V_Gen75 {
  		@com.google.inject.Inject
  		public V_Gen75(V_Gen76 v_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  