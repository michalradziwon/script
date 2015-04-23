
  package gen;
  public class Y_Gen90 {
  		@com.google.inject.Inject
  		public Y_Gen90(Y_Gen91 y_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  