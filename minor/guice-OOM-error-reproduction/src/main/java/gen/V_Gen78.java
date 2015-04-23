
  package gen;
  public class V_Gen78 {
  		@com.google.inject.Inject
  		public V_Gen78(V_Gen79 v_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  