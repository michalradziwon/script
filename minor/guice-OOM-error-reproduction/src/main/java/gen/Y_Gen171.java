
  package gen;
  public class Y_Gen171 {
  		@com.google.inject.Inject
  		public Y_Gen171(Y_Gen172 y_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  