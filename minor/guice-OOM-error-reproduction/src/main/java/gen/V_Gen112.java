
  package gen;
  public class V_Gen112 {
  		@com.google.inject.Inject
  		public V_Gen112(V_Gen113 v_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  