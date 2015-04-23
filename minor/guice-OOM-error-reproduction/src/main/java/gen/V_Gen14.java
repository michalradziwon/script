
  package gen;
  public class V_Gen14 {
  		@com.google.inject.Inject
  		public V_Gen14(V_Gen15 v_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  