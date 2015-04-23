
  package gen;
  public class Y_Gen157 {
  		@com.google.inject.Inject
  		public Y_Gen157(Y_Gen158 y_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  