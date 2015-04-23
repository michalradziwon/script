
  package gen;
  public class V_Gen121 {
  		@com.google.inject.Inject
  		public V_Gen121(V_Gen122 v_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  