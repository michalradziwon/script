
  package gen;
  public class V_Gen13 {
  		@com.google.inject.Inject
  		public V_Gen13(V_Gen14 v_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  