
  package gen;
  public class Y_Gen194 {
  		@com.google.inject.Inject
  		public Y_Gen194(Y_Gen195 y_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  