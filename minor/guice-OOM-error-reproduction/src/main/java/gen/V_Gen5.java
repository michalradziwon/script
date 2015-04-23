
  package gen;
  public class V_Gen5 {
  		@com.google.inject.Inject
  		public V_Gen5(V_Gen6 v_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  