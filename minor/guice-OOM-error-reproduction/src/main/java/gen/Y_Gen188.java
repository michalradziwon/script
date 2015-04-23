
  package gen;
  public class Y_Gen188 {
  		@com.google.inject.Inject
  		public Y_Gen188(Y_Gen189 y_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  