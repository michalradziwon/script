
  package gen;
  public class V_Gen2 {
  		@com.google.inject.Inject
  		public V_Gen2(V_Gen3 v_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  