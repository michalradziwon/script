
  package gen;
  public class Y_Gen127 {
  		@com.google.inject.Inject
  		public Y_Gen127(Y_Gen128 y_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  