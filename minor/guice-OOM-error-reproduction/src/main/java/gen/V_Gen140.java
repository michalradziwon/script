
  package gen;
  public class V_Gen140 {
  		@com.google.inject.Inject
  		public V_Gen140(V_Gen141 v_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  