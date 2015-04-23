
  package gen;
  public class V_Gen124 {
  		@com.google.inject.Inject
  		public V_Gen124(V_Gen125 v_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  