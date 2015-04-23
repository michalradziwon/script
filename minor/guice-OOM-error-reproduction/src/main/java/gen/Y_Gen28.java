
  package gen;
  public class Y_Gen28 {
  		@com.google.inject.Inject
  		public Y_Gen28(Y_Gen29 y_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  