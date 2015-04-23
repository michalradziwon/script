
  package gen;
  public class V_Gen105 {
  		@com.google.inject.Inject
  		public V_Gen105(V_Gen106 v_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  