
  package gen;
  public class Y_Gen101 {
  		@com.google.inject.Inject
  		public Y_Gen101(Y_Gen102 y_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  