
  package gen;
  public class V_Gen44 {
  		@com.google.inject.Inject
  		public V_Gen44(V_Gen45 v_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  