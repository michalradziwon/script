
  package gen;
  public class Y_Gen97 {
  		@com.google.inject.Inject
  		public Y_Gen97(Y_Gen98 y_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  