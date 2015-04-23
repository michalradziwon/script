
  package gen;
  public class V_Gen132 {
  		@com.google.inject.Inject
  		public V_Gen132(V_Gen133 v_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  