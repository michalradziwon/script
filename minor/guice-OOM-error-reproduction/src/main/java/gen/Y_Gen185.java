
  package gen;
  public class Y_Gen185 {
  		@com.google.inject.Inject
  		public Y_Gen185(Y_Gen186 y_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  