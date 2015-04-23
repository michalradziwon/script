
  package gen;
  public class V_Gen108 {
  		@com.google.inject.Inject
  		public V_Gen108(V_Gen109 v_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  