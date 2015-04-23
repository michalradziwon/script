
  package gen;
  public class Y_Gen126 {
  		@com.google.inject.Inject
  		public Y_Gen126(Y_Gen127 y_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  