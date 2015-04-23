
  package gen;
  public class V_Gen150 {
  		@com.google.inject.Inject
  		public V_Gen150(V_Gen151 v_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  