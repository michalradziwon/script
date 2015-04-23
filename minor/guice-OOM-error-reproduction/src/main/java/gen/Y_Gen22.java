
  package gen;
  public class Y_Gen22 {
  		@com.google.inject.Inject
  		public Y_Gen22(Y_Gen23 y_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  