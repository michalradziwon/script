
  package gen;
  public class V_Gen144 {
  		@com.google.inject.Inject
  		public V_Gen144(V_Gen145 v_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  