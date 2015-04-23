
  package gen;
  public class Y_Gen174 {
  		@com.google.inject.Inject
  		public Y_Gen174(Y_Gen175 y_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  