
  package gen;
  public class V_Gen116 {
  		@com.google.inject.Inject
  		public V_Gen116(V_Gen117 v_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  