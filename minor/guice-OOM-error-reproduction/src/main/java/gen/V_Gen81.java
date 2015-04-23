
  package gen;
  public class V_Gen81 {
  		@com.google.inject.Inject
  		public V_Gen81(V_Gen82 v_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  