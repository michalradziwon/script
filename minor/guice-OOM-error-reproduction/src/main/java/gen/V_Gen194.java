
  package gen;
  public class V_Gen194 {
  		@com.google.inject.Inject
  		public V_Gen194(V_Gen195 v_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  