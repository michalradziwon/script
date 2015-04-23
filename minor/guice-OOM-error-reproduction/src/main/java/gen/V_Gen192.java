
  package gen;
  public class V_Gen192 {
  		@com.google.inject.Inject
  		public V_Gen192(V_Gen193 v_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  