
  package gen;
  public class Y_Gen104 {
  		@com.google.inject.Inject
  		public Y_Gen104(Y_Gen105 y_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  