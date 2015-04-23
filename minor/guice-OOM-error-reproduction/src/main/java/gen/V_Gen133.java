
  package gen;
  public class V_Gen133 {
  		@com.google.inject.Inject
  		public V_Gen133(V_Gen134 v_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  