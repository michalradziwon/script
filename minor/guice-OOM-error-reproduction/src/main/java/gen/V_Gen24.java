
  package gen;
  public class V_Gen24 {
  		@com.google.inject.Inject
  		public V_Gen24(V_Gen25 v_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  