
  package gen;
  public class V_Gen46 {
  		@com.google.inject.Inject
  		public V_Gen46(V_Gen47 v_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  