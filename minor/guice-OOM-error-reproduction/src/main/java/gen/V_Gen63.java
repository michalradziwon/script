
  package gen;
  public class V_Gen63 {
  		@com.google.inject.Inject
  		public V_Gen63(V_Gen64 v_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  