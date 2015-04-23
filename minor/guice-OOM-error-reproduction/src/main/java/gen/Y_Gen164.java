
  package gen;
  public class Y_Gen164 {
  		@com.google.inject.Inject
  		public Y_Gen164(Y_Gen165 y_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  