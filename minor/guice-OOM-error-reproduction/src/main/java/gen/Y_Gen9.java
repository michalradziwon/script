
  package gen;
  public class Y_Gen9 {
  		@com.google.inject.Inject
  		public Y_Gen9(Y_Gen10 y_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  