
  package gen;
  public class V_Gen95 {
  		@com.google.inject.Inject
  		public V_Gen95(V_Gen96 v_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  