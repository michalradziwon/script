
  package gen;
  public class V_Gen35 {
  		@com.google.inject.Inject
  		public V_Gen35(V_Gen36 v_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  