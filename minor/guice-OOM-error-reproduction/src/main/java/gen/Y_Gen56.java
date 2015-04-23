
  package gen;
  public class Y_Gen56 {
  		@com.google.inject.Inject
  		public Y_Gen56(Y_Gen57 y_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  