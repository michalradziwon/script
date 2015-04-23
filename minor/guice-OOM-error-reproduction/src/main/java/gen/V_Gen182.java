
  package gen;
  public class V_Gen182 {
  		@com.google.inject.Inject
  		public V_Gen182(V_Gen183 v_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  