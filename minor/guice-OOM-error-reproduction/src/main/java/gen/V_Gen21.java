
  package gen;
  public class V_Gen21 {
  		@com.google.inject.Inject
  		public V_Gen21(V_Gen22 v_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  