
  package gen;
  public class Y_Gen196 {
  		@com.google.inject.Inject
  		public Y_Gen196(Y_Gen197 y_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  