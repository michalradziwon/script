
  package gen;
  public class V_Gen84 {
  		@com.google.inject.Inject
  		public V_Gen84(V_Gen85 v_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  