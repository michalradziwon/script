
  package gen;
  public class Y_Gen197 {
  		@com.google.inject.Inject
  		public Y_Gen197(Y_Gen198 y_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  