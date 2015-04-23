
  package gen;
  public class V_Gen100 {
  		@com.google.inject.Inject
  		public V_Gen100(V_Gen101 v_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  