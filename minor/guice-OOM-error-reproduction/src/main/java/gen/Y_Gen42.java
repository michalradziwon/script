
  package gen;
  public class Y_Gen42 {
  		@com.google.inject.Inject
  		public Y_Gen42(Y_Gen43 y_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  