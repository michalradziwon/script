
  package gen;
  public class V_Gen59 {
  		@com.google.inject.Inject
  		public V_Gen59(V_Gen60 v_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  