
  package gen;
  public class Y_Gen57 {
  		@com.google.inject.Inject
  		public Y_Gen57(Y_Gen58 y_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  