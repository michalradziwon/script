
  package gen;
  public class V_Gen163 {
  		@com.google.inject.Inject
  		public V_Gen163(V_Gen164 v_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  