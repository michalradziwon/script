
  package gen;
  public class V_Gen110 {
  		@com.google.inject.Inject
  		public V_Gen110(V_Gen111 v_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  