
  package gen;
  public class V_Gen80 {
  		@com.google.inject.Inject
  		public V_Gen80(V_Gen81 v_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  