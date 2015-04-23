
  package gen;
  public class Y_Gen195 {
  		@com.google.inject.Inject
  		public Y_Gen195(Y_Gen196 y_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  