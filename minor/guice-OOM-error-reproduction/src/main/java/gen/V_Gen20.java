
  package gen;
  public class V_Gen20 {
  		@com.google.inject.Inject
  		public V_Gen20(V_Gen21 v_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  