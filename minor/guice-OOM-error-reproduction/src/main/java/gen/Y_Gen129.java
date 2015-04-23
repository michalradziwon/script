
  package gen;
  public class Y_Gen129 {
  		@com.google.inject.Inject
  		public Y_Gen129(Y_Gen130 y_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  