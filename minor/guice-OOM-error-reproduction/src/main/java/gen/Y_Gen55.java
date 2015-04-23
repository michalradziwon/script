
  package gen;
  public class Y_Gen55 {
  		@com.google.inject.Inject
  		public Y_Gen55(Y_Gen56 y_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  