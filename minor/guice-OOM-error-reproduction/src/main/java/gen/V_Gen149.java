
  package gen;
  public class V_Gen149 {
  		@com.google.inject.Inject
  		public V_Gen149(V_Gen150 v_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  