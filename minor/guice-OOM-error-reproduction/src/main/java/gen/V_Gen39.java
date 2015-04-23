
  package gen;
  public class V_Gen39 {
  		@com.google.inject.Inject
  		public V_Gen39(V_Gen40 v_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  