
  package gen;
  public class V_Gen99 {
  		@com.google.inject.Inject
  		public V_Gen99(V_Gen100 v_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  