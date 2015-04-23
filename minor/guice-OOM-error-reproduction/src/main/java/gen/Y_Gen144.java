
  package gen;
  public class Y_Gen144 {
  		@com.google.inject.Inject
  		public Y_Gen144(Y_Gen145 y_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  