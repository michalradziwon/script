
  package gen;
  public class V_Gen16 {
  		@com.google.inject.Inject
  		public V_Gen16(V_Gen17 v_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  