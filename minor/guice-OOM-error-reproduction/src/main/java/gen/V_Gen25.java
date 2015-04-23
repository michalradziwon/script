
  package gen;
  public class V_Gen25 {
  		@com.google.inject.Inject
  		public V_Gen25(V_Gen26 v_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  