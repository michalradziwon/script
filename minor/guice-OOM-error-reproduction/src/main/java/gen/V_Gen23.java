
  package gen;
  public class V_Gen23 {
  		@com.google.inject.Inject
  		public V_Gen23(V_Gen24 v_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  