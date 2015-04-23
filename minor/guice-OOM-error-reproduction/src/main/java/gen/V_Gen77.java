
  package gen;
  public class V_Gen77 {
  		@com.google.inject.Inject
  		public V_Gen77(V_Gen78 v_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  