
  package gen;
  public class Y_Gen31 {
  		@com.google.inject.Inject
  		public Y_Gen31(Y_Gen32 y_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  