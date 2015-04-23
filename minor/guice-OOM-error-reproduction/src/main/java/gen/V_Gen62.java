
  package gen;
  public class V_Gen62 {
  		@com.google.inject.Inject
  		public V_Gen62(V_Gen63 v_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  