
  package gen;
  public class V_Gen92 {
  		@com.google.inject.Inject
  		public V_Gen92(V_Gen93 v_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  