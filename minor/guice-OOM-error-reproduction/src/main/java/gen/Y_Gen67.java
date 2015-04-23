
  package gen;
  public class Y_Gen67 {
  		@com.google.inject.Inject
  		public Y_Gen67(Y_Gen68 y_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  