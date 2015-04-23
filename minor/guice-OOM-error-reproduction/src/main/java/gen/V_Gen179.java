
  package gen;
  public class V_Gen179 {
  		@com.google.inject.Inject
  		public V_Gen179(V_Gen180 v_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  