
  package gen;
  public class V_Gen72 {
  		@com.google.inject.Inject
  		public V_Gen72(V_Gen73 v_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  