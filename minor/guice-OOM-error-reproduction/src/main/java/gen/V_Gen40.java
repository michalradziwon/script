
  package gen;
  public class V_Gen40 {
  		@com.google.inject.Inject
  		public V_Gen40(V_Gen41 v_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  