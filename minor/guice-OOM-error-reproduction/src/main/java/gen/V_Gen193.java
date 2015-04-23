
  package gen;
  public class V_Gen193 {
  		@com.google.inject.Inject
  		public V_Gen193(V_Gen194 v_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  