
  package gen;
  public class Y_Gen30 {
  		@com.google.inject.Inject
  		public Y_Gen30(Y_Gen31 y_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  