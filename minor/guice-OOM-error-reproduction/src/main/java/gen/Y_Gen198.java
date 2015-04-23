
  package gen;
  public class Y_Gen198 {
  		@com.google.inject.Inject
  		public Y_Gen198(Y_Gen199 y_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  