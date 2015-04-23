
  package gen;
  public class V_Gen166 {
  		@com.google.inject.Inject
  		public V_Gen166(V_Gen167 v_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  