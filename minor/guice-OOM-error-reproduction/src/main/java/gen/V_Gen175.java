
  package gen;
  public class V_Gen175 {
  		@com.google.inject.Inject
  		public V_Gen175(V_Gen176 v_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  