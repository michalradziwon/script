
  package gen;
  public class V_Gen134 {
  		@com.google.inject.Inject
  		public V_Gen134(V_Gen135 v_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  