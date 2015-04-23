
  package gen;
  public class Y_Gen47 {
  		@com.google.inject.Inject
  		public Y_Gen47(Y_Gen48 y_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  