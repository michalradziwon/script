
  package gen;
  public class V_Gen53 {
  		@com.google.inject.Inject
  		public V_Gen53(V_Gen54 v_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  