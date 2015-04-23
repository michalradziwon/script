
  package gen;
  public class V_Gen141 {
  		@com.google.inject.Inject
  		public V_Gen141(V_Gen142 v_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  