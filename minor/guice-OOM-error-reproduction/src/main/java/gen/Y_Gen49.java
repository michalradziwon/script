
  package gen;
  public class Y_Gen49 {
  		@com.google.inject.Inject
  		public Y_Gen49(Y_Gen50 y_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  