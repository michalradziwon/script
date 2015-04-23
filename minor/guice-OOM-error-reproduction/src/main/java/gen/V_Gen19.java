
  package gen;
  public class V_Gen19 {
  		@com.google.inject.Inject
  		public V_Gen19(V_Gen20 v_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  