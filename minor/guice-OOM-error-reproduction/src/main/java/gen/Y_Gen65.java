
  package gen;
  public class Y_Gen65 {
  		@com.google.inject.Inject
  		public Y_Gen65(Y_Gen66 y_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  