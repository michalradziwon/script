
  package gen;
  public class Y_Gen165 {
  		@com.google.inject.Inject
  		public Y_Gen165(Y_Gen166 y_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  