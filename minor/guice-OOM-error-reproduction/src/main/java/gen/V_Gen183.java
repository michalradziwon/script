
  package gen;
  public class V_Gen183 {
  		@com.google.inject.Inject
  		public V_Gen183(V_Gen184 v_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  