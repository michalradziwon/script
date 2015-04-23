
  package gen;
  public class Y_Gen66 {
  		@com.google.inject.Inject
  		public Y_Gen66(Y_Gen67 y_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  