
  package gen;
  public class V_Gen184 {
  		@com.google.inject.Inject
  		public V_Gen184(V_Gen185 v_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  