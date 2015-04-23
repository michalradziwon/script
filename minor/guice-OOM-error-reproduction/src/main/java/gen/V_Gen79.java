
  package gen;
  public class V_Gen79 {
  		@com.google.inject.Inject
  		public V_Gen79(V_Gen80 v_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  