
  package gen;
  public class V_Gen22 {
  		@com.google.inject.Inject
  		public V_Gen22(V_Gen23 v_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  