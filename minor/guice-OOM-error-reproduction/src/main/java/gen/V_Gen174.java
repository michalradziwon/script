
  package gen;
  public class V_Gen174 {
  		@com.google.inject.Inject
  		public V_Gen174(V_Gen175 v_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  