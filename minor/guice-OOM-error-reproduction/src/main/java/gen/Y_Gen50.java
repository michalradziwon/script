
  package gen;
  public class Y_Gen50 {
  		@com.google.inject.Inject
  		public Y_Gen50(Y_Gen51 y_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  