
  package gen;
  public class Y_Gen103 {
  		@com.google.inject.Inject
  		public Y_Gen103(Y_Gen104 y_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  