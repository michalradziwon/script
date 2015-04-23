
  package gen;
  public class V_Gen47 {
  		@com.google.inject.Inject
  		public V_Gen47(V_Gen48 v_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  